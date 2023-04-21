import request from '../request'

// 查询论坛帖子回复信息列表
export function listBbsReply(query) {
  return request({
    url: '/ga/bbsReply/list',
    method: 'get',
    params: query
  })
}

// 查询论坛帖子回复信息列表,携带二级回复
export function listBbsReplyWithReply(query) {
  return request({
    url: '/ga/bbsReply/listWith',
    method: 'get',
    params: query
  })
}

// 查询论坛帖子回复信息详细
export function getBbsReply(replyId) {
  return request({
    url: '/ga/bbsReply/' + replyId,
    method: 'get'
  })
}

// 新增论坛帖子回复信息
export function addBbsReply(data) {
  return request({
    url: '/ga/bbsReply',
    method: 'post',
    data: data
  })
}

// 修改论坛帖子回复信息
export function updateBbsReply(data) {
  return request({
    url: '/ga/bbsReply',
    method: 'put',
    data: data
  })
}

// 删除论坛帖子回复信息
export function delBbsReply(replyId) {
  return request({
    url: '/ga/bbsReply/' + replyId,
    method: 'delete'
  })
}
