<!-- 登录/注册页面 -->
<template>
    <div>
        <div v-if="isLogin" style="width: 40%;">
            <MDBContainer class="p-4" style="background-color: antiquewhite;">
                <h4 class="mb-4">账号登录</h4>
                <MDBInput class="mb-5" label="账号" v-model="inputData.login.username" />
                <MDBInput class="mb-5" label="密码" type="password" v-model="inputData.login.password" />
                <MDBInput class="mb-3" label="验证码" v-model="inputData.login.kaptchaStr" />
                <MDBCardImg class="mb-2" :src="kaptcha.context.kaptchaImg" />
                <div class="mb-3">
                    <MDBBtn color="link" @click="handleKaptcha">看不清楚?换一张</MDBBtn>
                </div>
                <MDBBtn color="primary" @click="handleLogin">登录</MDBBtn>
                <MDBBtn color="link" @click="changeIsLogin">还没有账号?点击这里注册</MDBBtn>
            </MDBContainer>
        </div>
        <div v-else style="width: 40%;">
            <MDBContainer class="p-4" style="background-color: antiquewhite;">
                <h4 class="mb-4">账号注册</h4>
                <MDBInput class="mb-5" label="账号" v-model="inputData.register.username" />
                <MDBInput class="mb-5" label="密码" type="password" v-model="inputData.register.firstPassword" />
                <MDBInput class="mb-5" label="再次输入密码" type="password" v-model="inputData.register.secondPassword" />
                <MDBBtn color="primary" @click="handleRegister">注册</MDBBtn>
                <MDBBtn color="link" @click="changeIsLogin">已有账号?回到登录</MDBBtn>
            </MDBContainer>
        </div>
    </div>
</template>

<script setup lang='ts'>
import { MDBBtn, MDBCardImg, MDBContainer, MDBInput } from 'mdb-vue-ui-kit'
import { onMounted, reactive, ref } from 'vue';
import { ElMessage } from 'element-plus';
import router from '../../router';
// 缓存
import userStore from '../../store/user';
// api
import { login, getKaptcha, register } from '@/api/account/login'


// 获取缓存
const user = userStore()

// 登录/注册判断
let isLogin = ref<boolean>(true)

// 验证码
const kaptcha = reactive({
    context: {
        kaptchaImg: "",
        uuid: "",
    }
})

// 输入数据
const inputData = reactive({
    login: {
        username: '',
        password: '',
        kaptchaStr: '',
    },
    register: {
        username: '',
        firstPassword: '',
        secondPassword: '',
    }
})

// 页面初始化
onMounted(() => {
    handleKaptcha()
})

// 登录/注册状态转换
function changeIsLogin() {
    isLogin.value = !isLogin.value
    // console.log(isLogin.value);
    // 隐私数据清空
    inputData.login.password = ''
    inputData.register.firstPassword = ''
    inputData.register.secondPassword = ''
}

// 获取并处理验证码
function handleKaptcha() {
    getKaptcha().then((res: any) => {
        let data = res.data
        console.log(data);
        kaptcha.context.kaptchaImg = "data:image/png;base64," + data.image
        kaptcha.context.uuid = data.uuid
        // console.log(kaptcha.context.kaptchaImg);
    })
}

// 登录处理
function handleLogin() {
    console.log(inputData.login);

    // 前端测试账号
    if (inputData.login.username === 'admin' && inputData.login.password === 'admin123') {
        ElMessage({
            message: '登录成功',
            type: 'success',
        })
        user.$patch((state) => {
            state.userId = 'admin'
            state.token = 'admin'
            state.permission = 'admin'
        })
        router.replace('/main')
        return
    }

    // 验证码空值判断
    if (inputData.login.kaptchaStr === '' || inputData.login.kaptchaStr == null) {
        ElMessage({
            message: '请输入验证码',
            type: 'error',
        })
        return
    }

    // 接口调用-后端数据处理
    login({
        username: inputData.login.username,
        password: inputData.login.password,
        code: inputData.login.kaptchaStr,
        uuid: kaptcha.context.uuid,
    }).then((res: any) => {
        let data = res.data
        user.$patch({
            userId: data.userId,
            token: data.token,
            permission: '1',
        })
        ElMessage({
            message: '登录成功',
            type: 'success',
        })
        // 返回主页
        router.push('/')
    }).catch(() => {
        ElMessage({
            message: '登录失败',
            type: 'error',
        })
    })
}

// 注册处理
function handleRegister() {
    console.log(inputData.register);
    // pwd判断
    if (inputData.register.firstPassword != inputData.register.secondPassword) {
        ElMessage({
            message: '两次输入密码不一致，请重新输入！',
            type: 'error',
        })
        return
    }

    // 调用接口注册
    register({
        username: inputData.register.username,
        password: inputData.register.firstPassword
    }).then((res: any) => {
        ElMessage({
            message: '注册成功',
            type: 'success',
        })
        isLogin.value = true
    })
}


</script>

<style>
/* .login {
    background-image: url('@/assets/images/background.jpg');
} */
</style>