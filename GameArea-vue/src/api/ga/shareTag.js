import request from '../request'

// 查询分享站标签管理列表
export function listShareTag(query) {
  return request({
    url: '/ga/shareTag/list',
    method: 'get',
    params: query
  })
}

// 查询分享站标签管理详细
export function getShareTag(tagId) {
  return request({
    url: '/ga/shareTag/' + tagId,
    method: 'get'
  })
}

// 新增分享站标签管理
export function addShareTag(data) {
  return request({
    url: '/ga/shareTag',
    method: 'post',
    data: data
  })
}

// 修改分享站标签管理
export function updateShareTag(data) {
  return request({
    url: '/ga/shareTag',
    method: 'put',
    data: data
  })
}

// 删除分享站标签管理
export function delShareTag(tagId) {
  return request({
    url: '/ga/shareTag/' + tagId,
    method: 'delete'
  })
}
