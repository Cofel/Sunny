package com.cofel.core.base;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * 前端返回对象
 */
public class Result implements Serializable {
    private static final long serialVersionUID = 970742694888064163L;

    /**
     * 成功与否的标志
     */
    private boolean success = true;

    /**
     * 返回状态码，为空则默认200，前端需要拦截一些常见状态码，例如403、404、500等
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer status;

    /**
     * 编码，可用于前端处理多语言，不需要则不返回编码
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String code;

    /**
     * 相关信息
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String msg;

    /**
     * 相关数据
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Object data;


}
