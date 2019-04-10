package com.orange.common.enums;

/**
 * 错误级别
 *
 * @author lizhihua
 * @date 2017/10/27.
 */
public enum ExceptionLevelEnum {

  /**
   * 指定非常严重的错误事件，这可能导致应用程序中止
   */
  FATAL(6),
  /**
   * 错误事件可能仍然允许应用程序继续运行
   */
  ERROR(5),
  /**
   * 指定具有潜在危害的情况
   */
  WARN(4),
  /**
   * 指定能够突出在粗粒度级别的应用程序运行情况的信息的消息
   */
  INFO(3),
  /**
   * 指定细粒度信息事件是最有用的应用程序调试
   */
  DEBUG(2),
  /**
   * 指定细粒度比DEBUG更低的信息事件
   */
  TRACE(1);


  private int level;

  private ExceptionLevelEnum(int level) {
    this.level = level;
  }

  public int getLevel() {
    return level;
  }

}
