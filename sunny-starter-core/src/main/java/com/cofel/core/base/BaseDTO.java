package com.cofel.core.base;

import com.cofel.core.util.Dates;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.persistence.Transient;
import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 基础试题类
 */
public class BaseDTO implements Serializable {
    private static final long serialVersionUID = -4885855682246405315L;

    public static final String FIELD_OPERATE = "operate";
    public static final String FLELD_OBJECT_VERSION_NUMBER = "versionNumber";
    public static final String FLELD_CREATE_BY = "createBy";
    public static final String FLELD_CREATOR = "creator";
    public static final String FLELD_CREATE_DATE = "createDate";
    public static final String FLELD_UPDATE_BY = "updateBy";
    public static final String FLELD_UPDATER = "updater";
    public static final String FLELD_UPDATE_DATE = "updateDate";

    /**
     * 操作类型，add/update/delete,
     */
    @Transient
    private String _operate;
    /**
     * 数据库版本号，每次发生update时自增， 用于实现悲观锁
     */
    private Long versionNumber;

    //
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
    @Transient
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
    @Transient
    private String updater;

    /**
     * 更新时间
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonFormat(pattern = Dates.DEFAULT_PATTERN)
    private Date updateDate;

    protected Map<String, Object> innerMap = new HashMap<>();

    //
    // 下面是扩展属性字段
    //--------------------------------------------

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String attribute1;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String attribute2;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String attribute3;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String attribute4;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String attribute5;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String attribute6;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String attribute7;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String attribute8;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String attribute9;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String attribute10;

    public String get_operate() {
        return _operate;
    }

    public void set_operate(String _operate) {
        this._operate = _operate;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

    public String toJsonString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
    }

    public Long getVersionNumber() {
        return versionNumber;
    }

    public void setVersionNumber(Long versionNumber) {
        this.versionNumber = versionNumber;
    }

    public Long getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    public String getCreateor() {
        return createor;
    }

    public void setCreateor(String createor) {
        this.createor = createor;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Long getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Long updateBy) {
        this.updateBy = updateBy;
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    @JsonAnyGetter
    public Object getAttribute(String key) {
        return innerMap.get(key);
    }

    @JsonAnySetter
    public void setInnerMap(String key, Object obj) {
        innerMap.put(key, obj);
    }

    public String getAttribute1() {
        return attribute1;
    }

    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1;
    }

    public String getAttribute2() {
        return attribute2;
    }

    public void setAttribute2(String attribute2) {
        this.attribute2 = attribute2;
    }

    public String getAttribute3() {
        return attribute3;
    }

    public void setAttribute3(String attribute3) {
        this.attribute3 = attribute3;
    }

    public String getAttribute4() {
        return attribute4;
    }

    public void setAttribute4(String attribute4) {
        this.attribute4 = attribute4;
    }

    public String getAttribute5() {
        return attribute5;
    }

    public void setAttribute5(String attribute5) {
        this.attribute5 = attribute5;
    }

    public String getAttribute6() {
        return attribute6;
    }

    public void setAttribute6(String attribute6) {
        this.attribute6 = attribute6;
    }

    public String getAttribute7() {
        return attribute7;
    }

    public void setAttribute7(String attribute7) {
        this.attribute7 = attribute7;
    }

    public String getAttribute8() {
        return attribute8;
    }

    public void setAttribute8(String attribute8) {
        this.attribute8 = attribute8;
    }

    public String getAttribute9() {
        return attribute9;
    }

    public void setAttribute9(String attribute9) {
        this.attribute9 = attribute9;
    }

    public String getAttribute10() {
        return attribute10;
    }

    public void setAttribute10(String attribute10) {
        this.attribute10 = attribute10;
    }
}
