package com.orange.common.util.page;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 
 * @author Administrator
 *
 * @param <T>
 */
public class PageResult<T> implements Serializable {

    private static final long serialVersionUID = -7600434612547513436L;

    /**
     * 本页包含的数据
     */
    @JsonProperty(value = "LIST")
    private List<T> list;

    /**
     * 分页集
     */
    @JsonProperty(value = "PAGINATION")
    private Pagination pagination; 

    public PageResult(List<T> list, Pagination pagination) {
        super();
        this.list = list;
        this.pagination = pagination;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

}
