import request from '@/utils/request'

// 查询平台模块权限分配列表
export function listAreaPermissions(query) {
  return request({
    url: '/ga/areaPermissions/list',
    method: 'get',
    params: query
  })
}

// 查询平台模块权限分配详细
export function getAreaPermissions(id) {
  return request({
    url: '/ga/areaPermissions/' + id,
    method: 'get'
  })
}

// 新增平台模块权限分配
export function addAreaPermissions(data) {
  return request({
    url: '/ga/areaPermissions',
    method: 'post',
    data: data
  })
}

// 修改平台模块权限分配
export function updateAreaPermissions(data) {
  return request({
    url: '/ga/areaPermissions',
    method: 'put',
    data: data
  })
}

// 删除平台模块权限分配
export function delAreaPermissions(id) {
  return request({
    url: '/ga/areaPermissions/' + id,
    method: 'delete'
  })
}
