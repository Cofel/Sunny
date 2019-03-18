package com.cofel.core.base;

import com.cofel.core.util.Dates;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.beans.Transient;
import java.io.Serializable;
import java.util.Date;

/**
 * 基础试题类
 */
public class BaseDTO implements Serializable {
    private static final long serialVersionUID = -4885855682246405315L;

    public static final String FIELD_OPERATE = "operate";
    public static final String FLELD_OBJECT_VERSION_NUMBER="versionNumber";
    public static final String FLELD_CREATE_BY = "createBy";
    public static final String FLELD_CREATOR = "creator";
    public static final String FLELD_CREATE_DATE = "createDate";
    public static final String FLELD_UPDATE_BY = "updateBy";
    public static final String FLELD_UPDATER = "updater";
    public static final String FLELD_UPDATE_DATE = "updateDate";

    /**
     * 操作类型，add/update/delete,
     */
//    @Transient
    private String _operate;
    /**
     * 数据库版本号，每次发生update时自增， 用于实现悲观锁
     */
    private Long versionNumber;

    //--------------------------------------------
    // 下面是WHO字段
    //--------------------------------------------
    /**
     * 创建人用户名
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Long createBy;

    /**
     * 创建人名称
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
//    @Transient
    private String createor;

    /**
     * 创建时间
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonFormat(pattern = Dates.DEFAULT_PATTERN)
    private Date createDate;

    /**
     * 更新人用户名
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Long updateBy;

    /**
     * 更新人名称
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
//    @Transient
    private String updater;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonFormat(pattern = Dates.DEFAULT_PATTERN)
    private Date updateDate;

}
