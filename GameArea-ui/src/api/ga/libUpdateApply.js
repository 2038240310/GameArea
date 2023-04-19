import request from '../request'

// 查询资料库操作申请单列表
export function listLibUpdateApply(query) {
  return request({
    url: '/ga/libUpdateApply/list',
    method: 'get',
    params: query
  })
}

// 查询资料库操作申请单详细
export function getLibUpdateApply(id) {
  return request({
    url: '/ga/libUpdateApply/' + id,
    method: 'get'
  })
}

// 新增资料库操作申请单
export function addLibUpdateApply(data) {
  return request({
    url: '/ga/libUpdateApply',
    method: 'post',
    data: data
  })
}

// 修改资料库操作申请单
export function updateLibUpdateApply(data) {
  return request({
    url: '/ga/libUpdateApply',
    method: 'put',
    data: data
  })
}

// 删除资料库操作申请单
export function delLibUpdateApply(id) {
  return request({
    url: '/ga/libUpdateApply/' + id,
    method: 'delete'
  })
}
