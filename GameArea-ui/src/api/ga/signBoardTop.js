import request from '@/utils/request'

// 查询头条公告信息（主页告示牌图片展示）列表
export function listSignBoardTop(query) {
  return request({
    url: '/ga/signBoardTop/list',
    method: 'get',
    params: query
  })
}

// 查询头条公告信息（主页告示牌图片展示）详细
export function getSignBoardTop(topIp) {
  return request({
    url: '/ga/signBoardTop/' + topIp,
    method: 'get'
  })
}

// 新增头条公告信息（主页告示牌图片展示）
export function addSignBoardTop(data) {
  return request({
    url: '/ga/signBoardTop',
    method: 'post',
    data: data
  })
}

// 修改头条公告信息（主页告示牌图片展示）
export function updateSignBoardTop(data) {
  return request({
    url: '/ga/signBoardTop',
    method: 'put',
    data: data
  })
}

// 删除头条公告信息（主页告示牌图片展示）
export function delSignBoardTop(topIp) {
  return request({
    url: '/ga/signBoardTop/' + topIp,
    method: 'delete'
  })
}
