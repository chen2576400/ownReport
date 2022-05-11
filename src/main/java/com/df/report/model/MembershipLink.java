package com.df.report.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * 
 * @TableName membership_link
 */
@Entity
public class MembershipLink implements Serializable {
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
    @Column(name = "roleaobject_class")
    private String roleaobjectClass;

    /**
     * 
     */
    @Column(name = "roleaobject_id")
    private Long roleaobjectId;

    /**
     * 
     */
    @Column(name = "rolebobject_class")
    private String rolebobjectClass;

    /**
     * 
     */
    @Column(name = "rolebobject_id")
    private Long rolebobjectId;

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
    public String getRoleaobjectClass() {
        return roleaobjectClass;
    }

    /**
     * 
     */
    public void setRoleaobjectClass(String roleaobjectClass) {
        this.roleaobjectClass = roleaobjectClass;
    }

    /**
     * 
     */
    public Long getRoleaobjectId() {
        return roleaobjectId;
    }

    /**
     * 
     */
    public void setRoleaobjectId(Long roleaobjectId) {
        this.roleaobjectId = roleaobjectId;
    }

    /**
     * 
     */
    public String getRolebobjectClass() {
        return rolebobjectClass;
    }

    /**
     * 
     */
    public void setRolebobjectClass(String rolebobjectClass) {
        this.rolebobjectClass = rolebobjectClass;
    }

    /**
     * 
     */
    public Long getRolebobjectId() {
        return rolebobjectId;
    }

    /**
     * 
     */
    public void setRolebobjectId(Long rolebobjectId) {
        this.rolebobjectId = rolebobjectId;
    }
}