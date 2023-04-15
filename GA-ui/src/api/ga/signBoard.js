import request from '../request'

// 查询公告版信息列表
export function listSignBoard(query) {
  return request({
    url: '/ga/signBoard/list',
    method: 'get',
    params: query
  })
}

// 查询公告版信息详细
export function getSignBoard(boardId) {
  return request({
    url: '/ga/signBoard/' + boardId,
    method: 'get'
  })
}

// 新增公告版信息
export function addSignBoard(data) {
  return request({
    url: '/ga/signBoard',
    method: 'post',
    data: data
  })
}

// 修改公告版信息
export function updateSignBoard(data) {
  return request({
    url: '/ga/signBoard',
    method: 'put',
    data: data
  })
}

// 删除公告版信息
export function delSignBoard(boardId) {
  return request({
    url: '/ga/signBoard/' + boardId,
    method: 'delete'
  })
}
