import request from '../request'

// 查询分享站帖子回复列表
export function listShareCardReply(query) {
  return request({
    url: '/ga/shareCardReply/list',
    method: 'get',
    params: query
  })
}

// 查询分享站帖子回复详细
export function getShareCardReply(replyId) {
  return request({
    url: '/ga/shareCardReply/' + replyId,
    method: 'get'
  })
}

// 新增分享站帖子回复
export function addShareCardReply(data) {
  return request({
    url: '/ga/shareCardReply',
    method: 'post',
    data: data
  })
}

// 修改分享站帖子回复
export function updateShareCardReply(data) {
  return request({
    url: '/ga/shareCardReply',
    method: 'put',
    data: data
  })
}

// 删除分享站帖子回复
export function delShareCardReply(replyId) {
  return request({
    url: '/ga/shareCardReply/' + replyId,
    method: 'delete'
  })
}
