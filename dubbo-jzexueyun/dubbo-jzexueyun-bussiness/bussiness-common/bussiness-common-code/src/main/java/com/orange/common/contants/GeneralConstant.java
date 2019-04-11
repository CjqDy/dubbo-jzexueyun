package com.orange.common.contants;

import com.orange.common.enums.ReturnMsgEnum;

/**
 * @program: dubbo-jzexueyun
 * @description: GeneralConstant 通用常量
 * @author: chengjiaqi
 * @create: 2019/04/11 08:59
 **/
public class GeneralConstant {

    /**
     * 成功
     */
    public static final int SUCCESS = ReturnMsgEnum.SUCCESS.getCode();
    /**
     * 失败
     */
    public static final int FAIL = ReturnMsgEnum.BUSINESS_ERROR.getCode();

    /**
     * common配置文件
     */
    public static final String PROPERTIES_COMMON = "common";

    /**
     * 不做token检查的url关键字（包含关键字，就不做token检查）
     */
    public static final String TOKEN_CHECK_EXCULDE_URL_KEY = "token.checkExculdeUrlKey";

    /**
     * 逗号
     */
    public static final String COMMA = ",";

    /**
     * userID
     */
    public static final String HEADER_NAME_UID = "Uid";

}
