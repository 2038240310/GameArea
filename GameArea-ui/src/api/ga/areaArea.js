import request from '@/utils/request'

// 查询平台最高级分区列表
export function listAreaArea(query) {
  return request({
    url: '/ga/areaArea/list',
    method: 'get',
    params: query
  })
}

// 查询平台最高级分区详细
export function getAreaArea(id) {
  return request({
    url: '/ga/areaArea/' + id,
    method: 'get'
  })
}

// 新增平台最高级分区
export function addAreaArea(data) {
  return request({
    url: '/ga/areaArea',
    method: 'post',
    data: data
  })
}

// 修改平台最高级分区
export function updateAreaArea(data) {
  return request({
    url: '/ga/areaArea',
    method: 'put',
    data: data
  })
}

// 删除平台最高级分区
export function delAreaArea(id) {
  return request({
    url: '/ga/areaArea/' + id,
    method: 'delete'
  })
}
