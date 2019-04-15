package com.orange.common.enums;

/**
 * @program: dubbo-jzexueyun
 * @description:错误码返回
 * @author: chengjiaqi
 * @create: 2019/04/11 17:50
 **/
public enum ReturnMsgEnum {

    /**
     * 成功
     */
    SUCCESS(200, "操作成功"),

    /**
     * 页面未找到
     */
    NOT_FOUND(404, "服务路径未找到"),

    /**
     * 服务器内部错误
     */
    INTERNAL_ERROR(500, "服务器内部错误"),

    /**
     * 系统繁忙，请稍后再试，对应SystemBusyException
     */
    SYSTEM_BUSY_ERR(-1, "系统繁忙，请稍后再试"),
    /**
     * 过于频繁，请稍后再试,对应RequestFrequentException
     */
    REQUEST_FREQUENTLY_ERR(1100, "访问过于频繁，请稍后再试"),
    /**
     * 访问过期,对应TokenExpireException
     */
    TOKEN_EXPIRE(4001, "访问过期"),
    /**
     * 不合法的凭证，对应TokenIllegalException
     */
    TOKEN_ILLEGAL(4002, "不合法的凭证"),
    /**
     * 没有权限访问,对应AccessNoAuthException
     */
    NO_AUTH(4005, "没有权限访问"),
    /**
     * 业务错误,对应BusinessException,例如：数据库中值已经存在的异常，业务数据不完整的异常等
     */
    BUSINESS_ERROR(4006, "业务错误"),

    /**
     * 配置错误,对应ConfigException,例如：配置的值不符合预期的规则
     */
    CONFIG_ERROR(4007, "配置错误"),

    /**
     * 即时通讯错误,对应ImException
     */
    IM_ERROR(4008, "即时通讯错误"),

    /**
     * 短信发送错误,对应SmsException
     */
    SMS_ERROR(4009, "短信发送错误"),

    /**
     * 参数错误,对应ParamException
     */
    PARAM_ERROR(4100, "参数错误"),

    /**
     * 扫码登录错误码
     */
    LOGIN_ERROR(4011, "登录失败"),

    /**
     * 经销商、员工登录名已存在
     */
    USER_NAME_EXISTS(4012, "登录名已存在"),

    /**
     * 文件大小超出限制
     */
    EXCEED_MAX_FILE_SIZE(4013, "文件大小超出限制"),

    /**
     * 转换中
     */
    FILE_CONVERT(2001, "转换中"),

    /**
     * 转换失败
     */
    FILE_CONVERT_ERROR(2002, "转换失败"),

    /**
     * 大数据调用异常
     */
    BIG_DATA_INVOKE_EXCEPTION(4014, "大数据调用异常"),

    /**
     * 数据导入异常
     */
    DATA_IMPORT_EXCEPTION(4015,"数据导入异常"),

    AWARD_CLAIM_EXCEPTION(4016,"奖励已经领取"),

    /**
     * 定时任务调用异常
     */
    TIMED_TASK_EXCEPTION(4017,"定时任务调用异常"),

    /**
     * 原密码验证专用
     */
    PASSWORD_ERROR(4018,"原密码输入错误");

    private int code;

    private String msg;

    private ReturnMsgEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
