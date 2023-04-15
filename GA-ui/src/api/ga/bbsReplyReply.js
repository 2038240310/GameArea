import request from '../request'

// 查询论坛帖子二级回复消息列表
export function listBbsReplyReply(query) {
  return request({
    url: '/ga/bbsReplyReply/list',
    method: 'get',
    params: query
  })
}

// 查询论坛帖子二级回复消息详细
export function getBbsReplyReply(rrId) {
  return request({
    url: '/ga/bbsReplyReply/' + rrId,
    method: 'get'
  })
}

// 新增论坛帖子二级回复消息
export function addBbsReplyReply(data) {
  return request({
    url: '/ga/bbsReplyReply',
    method: 'post',
    data: data
  })
}

// 修改论坛帖子二级回复消息
export function updateBbsReplyReply(data) {
  return request({
    url: '/ga/bbsReplyReply',
    method: 'put',
    data: data
  })
}

// 删除论坛帖子二级回复消息
export function delBbsReplyReply(rrId) {
  return request({
    url: '/ga/bbsReplyReply/' + rrId,
    method: 'delete'
  })
}
