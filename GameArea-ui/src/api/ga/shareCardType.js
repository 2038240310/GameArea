import request from '../request'

// 查询分享站帖子类型列表
export function listShareCardType(query) {
  return request({
    url: '/ga/shareCardType/list',
    method: 'get',
    params: query
  })
}

// 查询分享站帖子类型详细
export function getShareCardType(typeId) {
  return request({
    url: '/ga/shareCardType/' + typeId,
    method: 'get'
  })
}

// 新增分享站帖子类型
export function addShareCardType(data) {
  return request({
    url: '/ga/shareCardType',
    method: 'post',
    data: data
  })
}

// 修改分享站帖子类型
export function updateShareCardType(data) {
  return request({
    url: '/ga/shareCardType',
    method: 'put',
    data: data
  })
}

// 删除分享站帖子类型
export function delShareCardType(typeId) {
  return request({
    url: '/ga/shareCardType/' + typeId,
    method: 'delete'
  })
}
