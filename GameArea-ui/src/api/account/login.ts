import request from '../request'

// 账号注册
export function register(data: any) {
    return request({
        url: '/ga/account/register/add',
        method: 'post',
        data: data,
    })
}

// 账号登录
export function login(data: any) {
    return request({
        url: '/ga/account/login/check',
        method: 'post',
        data: data
    })
}

// 验证码获取
export function getKaptcha() {
    return request({
        url: '/ga/account/login/kaptcha/get',
        method: 'get',
    })
}