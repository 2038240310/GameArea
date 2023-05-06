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
    // 数据缓存
    persist: {
        enabled: true,
        strategies: [
            {
                key: 'user',
                storage: localStorage,
            }
        ]
    }
})