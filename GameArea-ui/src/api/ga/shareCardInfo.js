import request from '@/utils/request'

// 查询资源站帖子信息列表
export function listShareCardInfo(query) {
  return request({
    url: '/ga/shareCardInfo/list',
    method: 'get',
    params: query
  })
}

// 查询资源站帖子信息详细
export function getShareCardInfo(infoId) {
  return request({
    url: '/ga/shareCardInfo/' + infoId,
    method: 'get'
  })
}

// 新增资源站帖子信息
export function addShareCardInfo(data) {
  return request({
    url: '/ga/shareCardInfo',
    method: 'post',
    data: data
  })
}

// 修改资源站帖子信息
export function updateShareCardInfo(data) {
  return request({
    url: '/ga/shareCardInfo',
    method: 'put',
    data: data
  })
}

// 删除资源站帖子信息
export function delShareCardInfo(infoId) {
  return request({
    url: '/ga/shareCardInfo/' + infoId,
    method: 'delete'
  })
}
