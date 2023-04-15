import request from '../request'

// 查询论坛板块列表
export function listBbsBlock(query) {
  return request({
    url: '/ga/bbsBlock/list',
    method: 'get',
    params: query
  })
}

// 查询论坛板块详细
export function getBbsBlock(blockId) {
  return request({
    url: '/ga/bbsBlock/' + blockId,
    method: 'get'
  })
}

// 新增论坛板块
export function addBbsBlock(data) {
  return request({
    url: '/ga/bbsBlock',
    method: 'post',
    data: data
  })
}

// 修改论坛板块
export function updateBbsBlock(data) {
  return request({
    url: '/ga/bbsBlock',
    method: 'put',
    data: data
  })
}

// 删除论坛板块
export function delBbsBlock(blockId) {
  return request({
    url: '/ga/bbsBlock/' + blockId,
    method: 'delete'
  })
}
