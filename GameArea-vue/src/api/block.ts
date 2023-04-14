import type { LocationQueryValue } from 'vue-router'
import axios from './'
//获取板块列表
//默认获取第一页，每页10条数据
export function getBlocklist(current: number = 1, size: number = 10) {
    return axios.get<any>('/ga/bbsBlock/list?current='+current+'&size='+size)
}
//获取板块详情
export function getBlockDetail(id: string | LocationQueryValue[]) {
    return axios.get<any>('​/ga​/bbsBlock​/' + id)
}
