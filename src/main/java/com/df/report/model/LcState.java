package com.df.report.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * 
 * @TableName lc_state
 */

@Entity
public class LcState implements Serializable {
    /**
     * 
     */

    private String classname;

    /**
     * 
     */
    @Id
    private Long id;

    /**
     * 
     */
    @Column(name = "create_stamp")
    private Date createStamp;

    /**
     * 
     */
    @Column(name = "is_deleted")
    private Boolean isDeleted;

    /**
     * 
     */
    @Column(name = "is_persisted")
    private Boolean isPersisted;

    /**
     * 
     */
    @Column(name = "mark_for_delete")
    private Long markForDelete;

    /**
     * 
     */
    @Column(name = "modify_stamp")
    private Date modifyStamp;

    /**
     * 
     */
    @Column(name = "update_count")
    private Integer updateCount;

    /**
     * 
     */
    @Column(name = "update_stamp")
    private Date updateStamp;

    /**
     * 
     */
    private Boolean verified;

    /**
     * 
     */
    @Column(name = "container_ref_class")
    private String containerRefClass;

    /**
     * 
     */
    @Column(name = "container_ref_id")
    private Long containerRefId;

    /**
     * 
     */
    private Boolean selectable;

    /**
     * 
     */
    @Column(name = "state_code")
    private String stateCode;

    /**
     * 
     */
    @Column(name = "state_comment")
    private String stateComment;

    /**
     * 
     */
    @Column(name = "state_name")
    private String stateName;

    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    public String getClassname() {
        return classname;
    }

    /**
     * 
     */
    public void setClassname(String classname) {
        this.classname = classname;
    }

    /**
     * 
     */
    public Long getId() {
        return id;
    }

    /**
     * 
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 
     */
    public Date getCreateStamp() {
        return createStamp;
    }

    /**
     * 
     */
    public void setCreateStamp(Date createStamp) {
        this.createStamp = createStamp;
    }

    /**
     * 
     */
    public Boolean getIsDeleted() {
        return isDeleted;
    }

    /**
     * 
     */
    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * 
     */
    public Boolean getIsPersisted() {
        return isPersisted;
    }

    /**
     * 
     */
    public void setIsPersisted(Boolean isPersisted) {
        this.isPersisted = isPersisted;
    }

    /**
     * 
     */
    public Long getMarkForDelete() {
        return markForDelete;
    }

    /**
     * 
     */
    public void setMarkForDelete(Long markForDelete) {
        this.markForDelete = markForDelete;
    }

    /**
     * 
     */
    public Date getModifyStamp() {
        return modifyStamp;
    }

    /**
     * 
     */
    public void setModifyStamp(Date modifyStamp) {
        this.modifyStamp = modifyStamp;
    }

    /**
     * 
     */
    public Integer getUpdateCount() {
        return updateCount;
    }

    /**
     * 
     */
    public void setUpdateCount(Integer updateCount) {
        this.updateCount = updateCount;
    }

    /**
     * 
     */
    public Date getUpdateStamp() {
        return updateStamp;
    }

    /**
     * 
     */
    public void setUpdateStamp(Date updateStamp) {
        this.updateStamp = updateStamp;
    }

    /**
     * 
     */
    public Boolean getVerified() {
        return verified;
    }

    /**
     * 
     */
    public void setVerified(Boolean verified) {
        this.verified = verified;
    }

    /**
     * 
     */
    public String getContainerRefClass() {
        return containerRefClass;
    }

    /**
     * 
     */
    public void setContainerRefClass(String containerRefClass) {
        this.containerRefClass = containerRefClass;
    }

    /**
     * 
     */
    public Long getContainerRefId() {
        return containerRefId;
    }

    /**
     * 
     */
    public void setContainerRefId(Long containerRefId) {
        this.containerRefId = containerRefId;
    }

    /**
     * 
     */
    public Boolean getSelectable() {
        return selectable;
    }

    /**
     * 
     */
    public void setSelectable(Boolean selectable) {
        this.selectable = selectable;
    }

    /**
     * 
     */
    public String getStateCode() {
        return stateCode;
    }

    /**
     * 
     */
    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    /**
     * 
     */
    public String getStateComment() {
        return stateComment;
    }

    /**
     * 
     */
    public void setStateComment(String stateComment) {
        this.stateComment = stateComment;
    }

    /**
     * 
     */
    public String getStateName() {
        return stateName;
    }

    /**
     * 
     */
    public void setStateName(String stateName) {
        this.stateName = stateName;
    }
}