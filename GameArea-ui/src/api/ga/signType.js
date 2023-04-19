import request from '../request'

// 查询公告版类型管理列表
export function listSignType(query) {
  return request({
    url: '/ga/signType/list',
    method: 'get',
    params: query
  })
}

// 查询公告版类型管理详细
export function getSignType(typeId) {
  return request({
    url: '/ga/signType/' + typeId,
    method: 'get'
  })
}

// 新增公告版类型管理
export function addSignType(data) {
  return request({
    url: '/ga/signType',
    method: 'post',
    data: data
  })
}

// 修改公告版类型管理
export function updateSignType(data) {
  return request({
    url: '/ga/signType',
    method: 'put',
    data: data
  })
}

// 删除公告版类型管理
export function delSignType(typeId) {
  return request({
    url: '/ga/signType/' + typeId,
    method: 'delete'
  })
}
