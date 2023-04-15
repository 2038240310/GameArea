import request from '../request'

// 查询分享站帖子列表
export function listShareCard(query) {
  return request({
    url: '/ga/shareCard/list',
    method: 'get',
    params: query
  })
}

// 查询分享站帖子详细
export function getShareCard(cardId) {
  return request({
    url: '/ga/shareCard/' + cardId,
    method: 'get'
  })
}

// 新增分享站帖子
export function addShareCard(data) {
  return request({
    url: '/ga/shareCard',
    method: 'post',
    data: data
  })
}

// 修改分享站帖子
export function updateShareCard(data) {
  return request({
    url: '/ga/shareCard',
    method: 'put',
    data: data
  })
}

// 删除分享站帖子
export function delShareCard(cardId) {
  return request({
    url: '/ga/shareCard/' + cardId,
    method: 'delete'
  })
}
