package com.df.report.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * 
 * @TableName pigroup
 */
@Entity
public class Pigroup implements Serializable {
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
    @Column(name = "domain_ref_class")
    private String domainRefClass;

    /**
     * 
     */
    @Column(name = "domain_ref_id")
    private Long domainRefId;

    /**
     * 
     */
    @Column(name = "inherited_domain")
    private Boolean inheritedDomain;

    /**
     * 
     */
    private Boolean disabled;

    /**
     * 
     */
    @Column(name = "disabled_date")
    private Date disabledDate;

    /**
     * 
     */
    private Boolean internal;

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    @Column(name = "repair_needed")
    private Boolean repairNeeded;

    /**
     * 
     */
    @Column(name = "principal_status")
    private String principalStatus;

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
    private String description;

    /**
     * 
     */
    private Boolean replicate;

    /**
     * 
     */
    @Column(name = "role_ref_class")
    private String roleRefClass;

    /**
     * 
     */
    @Column(name = "role_ref_id")
    private Long roleRefId;

    /**
     * 
     */
    @Column(name = "group_category")
    private String groupCategory;

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
    public String getDomainRefClass() {
        return domainRefClass;
    }

    /**
     * 
     */
    public void setDomainRefClass(String domainRefClass) {
        this.domainRefClass = domainRefClass;
    }

    /**
     * 
     */
    public Long getDomainRefId() {
        return domainRefId;
    }

    /**
     * 
     */
    public void setDomainRefId(Long domainRefId) {
        this.domainRefId = domainRefId;
    }

    /**
     * 
     */
    public Boolean getInheritedDomain() {
        return inheritedDomain;
    }

    /**
     * 
     */
    public void setInheritedDomain(Boolean inheritedDomain) {
        this.inheritedDomain = inheritedDomain;
    }

    /**
     * 
     */
    public Boolean getDisabled() {
        return disabled;
    }

    /**
     * 
     */
    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    /**
     * 
     */
    public Date getDisabledDate() {
        return disabledDate;
    }

    /**
     * 
     */
    public void setDisabledDate(Date disabledDate) {
        this.disabledDate = disabledDate;
    }

    /**
     * 
     */
    public Boolean getInternal() {
        return internal;
    }

    /**
     * 
     */
    public void setInternal(Boolean internal) {
        this.internal = internal;
    }

    /**
     * 
     */
    public String getName() {
        return name;
    }

    /**
     * 
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     */
    public Boolean getRepairNeeded() {
        return repairNeeded;
    }

    /**
     * 
     */
    public void setRepairNeeded(Boolean repairNeeded) {
        this.repairNeeded = repairNeeded;
    }

    /**
     * 
     */
    public String getPrincipalStatus() {
        return principalStatus;
    }

    /**
     * 
     */
    public void setPrincipalStatus(String principalStatus) {
        this.principalStatus = principalStatus;
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
    public String getDescription() {
        return description;
    }

    /**
     * 
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 
     */
    public Boolean getReplicate() {
        return replicate;
    }

    /**
     * 
     */
    public void setReplicate(Boolean replicate) {
        this.replicate = replicate;
    }

    /**
     * 
     */
    public String getRoleRefClass() {
        return roleRefClass;
    }

    /**
     * 
     */
    public void setRoleRefClass(String roleRefClass) {
        this.roleRefClass = roleRefClass;
    }

    /**
     * 
     */
    public Long getRoleRefId() {
        return roleRefId;
    }

    /**
     * 
     */
    public void setRoleRefId(Long roleRefId) {
        this.roleRefId = roleRefId;
    }

    /**
     * 
     */
    public String getGroupCategory() {
        return groupCategory;
    }

    /**
     * 
     */
    public void setGroupCategory(String groupCategory) {
        this.groupCategory = groupCategory;
    }
}