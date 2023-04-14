import request from '@/utils/request'

// 查询资料库资源路径列表
export function listLibPath(query) {
  return request({
    url: '/ga/libPath/list',
    method: 'get',
    params: query
  })
}

// 查询资料库资源路径详细
export function getLibPath(pathId) {
  return request({
    url: '/ga/libPath/' + pathId,
    method: 'get'
  })
}

// 新增资料库资源路径
export function addLibPath(data) {
  return request({
    url: '/ga/libPath',
    method: 'post',
    data: data
  })
}

// 修改资料库资源路径
export function updateLibPath(data) {
  return request({
    url: '/ga/libPath',
    method: 'put',
    data: data
  })
}

// 删除资料库资源路径
export function delLibPath(pathId) {
  return request({
    url: '/ga/libPath/' + pathId,
    method: 'delete'
  })
}
