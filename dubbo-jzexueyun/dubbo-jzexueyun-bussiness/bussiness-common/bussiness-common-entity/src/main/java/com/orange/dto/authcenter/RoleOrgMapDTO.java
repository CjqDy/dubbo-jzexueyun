package com.orange.dto.authcenter;

import com.orange.common.util.page.Pagination;
import com.orange.entity.authcenter.RoleOrgMap;

/**
* RoleOrgMapDTO
*
* @author mybatis generator
* @date 2019/05/10
*/
public class RoleOrgMapDTO extends RoleOrgMap {

  /**
   * 分页参数
   */
  private Pagination pagination;

  public Pagination getPagination() {
    return pagination;
  }

  public void setPagination(Pagination pagination) {
    this.pagination = pagination;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(getClass().getSimpleName());
    sb.append(" [");
    sb.append(super.toString());
    sb.append("]");
    return sb.toString();
  }
}