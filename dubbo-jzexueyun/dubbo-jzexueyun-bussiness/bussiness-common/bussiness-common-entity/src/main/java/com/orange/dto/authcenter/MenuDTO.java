package com.orange.dto.authcenter;

import com.orange.common.util.page.Pagination;
import com.orange.entity.authcenter.Menu;

/**
* MenuDTO
*
* @author mybatis generator
* @date 2019/05/10
*/
public class MenuDTO extends Menu {

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