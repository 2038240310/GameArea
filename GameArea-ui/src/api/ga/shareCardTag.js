import request from '../request'

// 查询资源站帖子-标签关联列表
export function listShareCardTag(query) {
  return request({
    url: '/ga/shareCardTag/list',
    method: 'get',
    params: query
  })
}

// 查询资源站帖子-标签关联详细
export function getShareCardTag(relId) {
  return request({
    url: '/ga/shareCardTag/' + relId,
    method: 'get'
  })
}

// 新增资源站帖子-标签关联
export function addShareCardTag(data) {
  return request({
    url: '/ga/shareCardTag',
    method: 'post',
    data: data
  })
}

// 修改资源站帖子-标签关联
export function updateShareCardTag(data) {
  return request({
    url: '/ga/shareCardTag',
    method: 'put',
    data: data
  })
}

// 删除资源站帖子-标签关联
export function delShareCardTag(relId) {
  return request({
    url: '/ga/shareCardTag/' + relId,
    method: 'delete'
  })
}
