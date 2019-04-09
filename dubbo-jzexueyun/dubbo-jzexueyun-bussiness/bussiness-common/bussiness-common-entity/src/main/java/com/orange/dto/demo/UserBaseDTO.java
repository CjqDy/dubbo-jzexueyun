package com.orange.dto.demo;


import com.orange.entity.demo.UserBase;
import javafx.scene.control.Pagination;

/**
* UserBaseDTO
*
* @author mybatis generator
* @date 2018/06/05
*/
public class UserBaseDTO extends UserBase {

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