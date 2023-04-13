package com.ga.utils;

import com.google.code.kaptcha.Producer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * 验证码生成验证工具
 */
@Slf4j
public class CaptchaUtils {

    @Autowired
    private static Producer kaptchaProducer;

    @Autowired
    private static RedisTemplate redisTemplate;

    /**
     * 生成验证码与对应的uuid存入redis 默认验证码有效时间为2min
     * @return Map 含有uuid和base64格式的验证码图片
     */
    public static Map createCaptchaAndUuid() {
        // 返回结果
        Map resultMap = new HashMap<String, String>();
        // 验证码有效时间设定为120s
        Long timeout = 120L;

        // 生成验证码
        String text = kaptchaProducer.createText();
        BufferedImage image = kaptchaProducer.createImage(text);
        UUID uuid = UUID.randomUUID();

        // 流转换
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        try
        {
            ImageIO.write(image, "png", os);
        }
        catch (IOException e)
        {
            log.error(e.getMessage());
        }

//        Logger.getLogger(this.getClass().getName()).info("text:" + text + " uuid:" + uuid);

        // 存入redis缓存
        ValueOperations<String, String> valueOperations = redisTemplate.opsForValue();
        valueOperations.set(String.valueOf(uuid), text, timeout, TimeUnit.SECONDS);
        log.info("create captcha: { uuid: "+uuid+"\ttext: "+text+" } and save in redis and effective time: "+timeout+" .");
//        Logger.getLogger(this.getClass().getName()).info("{ uuid: "+uuid+" text: "+text+" }"+" --to save in redis");

        // base64编码
        byte[] bytes = os.toByteArray();

        resultMap.put("uuid", uuid);
        resultMap.put("image", Base64.getEncoder().encodeToString(os.toByteArray()));

        return resultMap;
    }

    public static boolean verify(String uuid, String text) {
        ValueOperations valueOperations = redisTemplate.opsForValue();
        String textInRedis = (String) valueOperations.get(uuid);

//        Logger.getLogger(this.getClass().getName()).info("verify: the value of " + uuid+" get in redis is *"+textInRedis+"*");
        if (textInRedis.equals(text)) {
            log.info(uuid+" : verified pass.");
            return true;
        }
        return false;
    }

}
