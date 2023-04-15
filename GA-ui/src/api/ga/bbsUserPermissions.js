import request from '../request'

// 查询帖子用户权限配置列表
export function listBbsUserPermissions(query) {
  return request({
    url: '/ga/bbsUserPermissions/list',
    method: 'get',
    params: query
  })
}

// 查询帖子用户权限配置详细
export function getBbsUserPermissions(id) {
  return request({
    url: '/ga/bbsUserPermissions/' + id,
    method: 'get'
  })
}

// 新增帖子用户权限配置
export function addBbsUserPermissions(data) {
  return request({
    url: '/ga/bbsUserPermissions',
    method: 'post',
    data: data
  })
}

// 修改帖子用户权限配置
export function updateBbsUserPermissions(data) {
  return request({
    url: '/ga/bbsUserPermissions',
    method: 'put',
    data: data
  })
}

// 删除帖子用户权限配置
export function delBbsUserPermissions(id) {
  return request({
    url: '/ga/bbsUserPermissions/' + id,
    method: 'delete'
  })
}
