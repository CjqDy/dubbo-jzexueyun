package com.orange.common.util.page;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * 
 * @author Administrator
 *
 */
public class Pagination implements Serializable{

    private static final long serialVersionUID = 5585187942830327188L;

    /**
     * 当前显示页
     */
    @JsonProperty(value = "PAGE")
    private Integer page;

    /**
     * 当前页记录数
     */
    @JsonProperty(value = "ROWS")
    private Integer rows;

    /**
     * 总记录数
     */
    @JsonProperty(value = "TOTAL")
    private Long total;

    /** 排序字段名**/
    @JsonProperty(value = "SORT_NAME")
    private String sortName;

    /** 排序**/
    @JsonProperty(value = "SORT_ORDER")
    private String sortOrder;

    public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}

	public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public String getSortName() {
        return sortName;
    }

    public void setSortName(String sortName) {
        this.sortName = sortName;
    }

    public String getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }
}
