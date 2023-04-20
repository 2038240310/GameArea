import axios from "axios"

const request = axios.create({
    baseURL: import.meta.env.VITE_BASE_API,
    timeout: 5000,
    withCredentials: true,
})

/**
 * 响应拦截器
 */
request.interceptors.response.use((res) => {
    const { data, config } = res
    if(data.code && data.code === 500 || data.code != 200) {
        return Promise.reject(data)
    }
    return data
})

export default request