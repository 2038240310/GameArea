import request from '@/utils/request'

// 查询平台用户信息列表
export function listAreaUserInfo(query) {
  return request({
    url: '/ga/areaUserInfo/list',
    method: 'get',
    params: query
  })
}

// 查询平台用户信息详细
export function getAreaUserInfo(id) {
  return request({
    url: '/ga/areaUserInfo/' + id,
    method: 'get'
  })
}

// 新增平台用户信息
export function addAreaUserInfo(data) {
  return request({
    url: '/ga/areaUserInfo',
    method: 'post',
    data: data
  })
}

// 修改平台用户信息
export function updateAreaUserInfo(data) {
  return request({
    url: '/ga/areaUserInfo',
    method: 'put',
    data: data
  })
}

// 删除平台用户信息
export function delAreaUserInfo(id) {
  return request({
    url: '/ga/areaUserInfo/' + id,
    method: 'delete'
  })
}
