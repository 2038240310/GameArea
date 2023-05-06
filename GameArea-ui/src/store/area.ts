// 分区缓存
import { defineStore } from 'pinia'

export default defineStore('area', {
    state: () => {
        return {
            areaId: '',
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
                key: 'area',
                storage: sessionStorage,
            }
        ]
    }
})