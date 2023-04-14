import request from '@/utils/request'

// 查询论坛帖子列表
export function listBbsCard(query) {
  return request({
    url: '/ga/bbsCard/list',
    method: 'get',
    params: query
  })
}

// 查询论坛帖子详细
export function getBbsCard(cardId) {
  return request({
    url: '/ga/bbsCard/' + cardId,
    method: 'get'
  })
}

// 新增论坛帖子
export function addBbsCard(data) {
  return request({
    url: '/ga/bbsCard',
    method: 'post',
    data: data
  })
}

// 修改论坛帖子
export function updateBbsCard(data) {
  return request({
    url: '/ga/bbsCard',
    method: 'put',
    data: data
  })
}

// 删除论坛帖子
export function delBbsCard(cardId) {
  return request({
    url: '/ga/bbsCard/' + cardId,
    method: 'delete'
  })
}
