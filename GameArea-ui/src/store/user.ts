// 用户缓存
import { defineStore } from 'pinia'

export default defineStore('user', {
    state: () => {
        return {
            userId: '',
            token: '',
            permission: '0',
        }
    },

    // 
    getters: {

    },

    // 
    actions: {

    },
})