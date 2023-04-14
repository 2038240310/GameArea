import request from '@/utils/request'

// 查询平台用户列表
export function listAreaUser(query) {
  return request({
    url: '/ga/areaUser/list',
    method: 'get',
    params: query
  })
}

// 查询平台用户详细
export function getAreaUser(id) {
  return request({
    url: '/ga/areaUser/' + id,
    method: 'get'
  })
}

// 新增平台用户
export function addAreaUser(data) {
  return request({
    url: '/ga/areaUser',
    method: 'post',
    data: data
  })
}

// 修改平台用户
export function updateAreaUser(data) {
  return request({
    url: '/ga/areaUser',
    method: 'put',
    data: data
  })
}

// 删除平台用户
export function delAreaUser(id) {
  return request({
    url: '/ga/areaUser/' + id,
    method: 'delete'
  })
}
