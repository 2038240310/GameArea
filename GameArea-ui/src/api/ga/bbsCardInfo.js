import request from '@/utils/request'

// 查询论坛帖子信息列表
export function listBbsCardInfo(query) {
  return request({
    url: '/ga/bbsCardInfo/list',
    method: 'get',
    params: query
  })
}

// 查询论坛帖子信息详细
export function getBbsCardInfo(infoId) {
  return request({
    url: '/ga/bbsCardInfo/' + infoId,
    method: 'get'
  })
}

// 新增论坛帖子信息
export function addBbsCardInfo(data) {
  return request({
    url: '/ga/bbsCardInfo',
    method: 'post',
    data: data
  })
}

// 修改论坛帖子信息
export function updateBbsCardInfo(data) {
  return request({
    url: '/ga/bbsCardInfo',
    method: 'put',
    data: data
  })
}

// 删除论坛帖子信息
export function delBbsCardInfo(infoId) {
  return request({
    url: '/ga/bbsCardInfo/' + infoId,
    method: 'delete'
  })
}
