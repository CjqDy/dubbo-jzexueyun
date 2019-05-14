package com.orange.common.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel(value = "返回集合")
public class Result implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    @JsonProperty(value = "RESULT_CODE")
    @ApiModelProperty(value = "结果编号")
    public int resultCode;
    @JsonProperty(value = "RESULT_DESC")
    @ApiModelProperty(value = "结果信息")
    public String resultDesc;
    @JsonProperty(value = "RESULT_NUM")
    @ApiModelProperty(value = "结果数量")
    public int resultNum;

    public Result() {
        super();
    }

    public Result(int resultCode, String resultDesc, int resultNum) {

        this.resultCode = resultCode;
        this.resultDesc = resultDesc;
        this.resultNum = resultNum;
    }

    public int getResultCode() {
        return resultCode;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultDesc() {
        return resultDesc;
    }

    public void setResultDesc(String resultDesc) {
        this.resultDesc = resultDesc;
    }

    public int getResultNum() {
        return resultNum;
    }

    public void setResultNum(int resultNum) {
        this.resultNum = resultNum;
    }


}
