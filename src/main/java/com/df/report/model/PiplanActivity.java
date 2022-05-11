package com.df.report.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * 
 * @TableName piplan_activity
 */
@Entity
public class PiplanActivity implements Serializable {
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
    @Column(name = "creator_ref_class")
    private String creatorRefClass;

    /**
     * 
     */
    @Column(name = "creator_ref_id")
    private Long creatorRefId;

    /**
     * 
     */
    @Column(name = "modifier_ref_class")
    private String modifierRefClass;

    /**
     * 
     */
    @Column(name = "modifier_ref_id")
    private Long modifierRefId;

    /**
     * 
     */
    @Column(name = "activity_type")
    private String activityType;

    /**
     * 
     */
    @Column(name = "actual_duration_format")
    private String actualDurationFormat;

    /**
     * 
     */
    @Column(name = "actual_duration_millis")
    private Long actualDurationMillis;

    /**
     * 
     */
    @Column(name = "actual_end_date")
    private Date actualEndDate;

    /**
     * 
     */
    @Column(name = "actual_equip_qty")
    private Double actualEquipQty;

    /**
     * 
     */
    @Column(name = "actual_start_date")
    private Date actualStartDate;

    /**
     * 
     */
    @Column(name = "actual_work_qty")
    private Double actualWorkQty;

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
    @Column(name = "control_updates_flag")
    private Boolean controlUpdatesFlag;

    /**
     * 
     */
    private Boolean critical;

    /**
     * 
     */
    private String description;

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
    @Column(name = "driving_path_flag")
    private Boolean drivingPathFlag;

    /**
     * 
     */
    @Column(name = "early_end_date")
    private Date earlyEndDate;

    /**
     * 
     */
    @Column(name = "early_start_date")
    private Date earlyStartDate;

    /**
     * 
     */
    @Column(name = "expect_end_date")
    private Date expectEndDate;

    /**
     * 
     */
    @Column(name = "free_float")
    private Double freeFloat;

    /**
     * 
     */
    @Column(name = "health_status_description")
    private String healthStatusDescription;

    /**
     * 
     */
    @Column(name = "health_status_type")
    private String healthStatusType;

    /**
     * 
     */
    @Column(name = "internal_index")
    private Integer internalIndex;

    /**
     * 
     */
    @Column(name = "late_end_date")
    private Date lateEndDate;

    /**
     * 
     */
    @Column(name = "late_start_date")
    private Date lateStartDate;

    /**
     * 
     */
    @Column(name = "line_number")
    private Integer lineNumber;

    /**
     * 
     */
    @Column(name = "lock_date")
    private Date lockDate;

    /**
     * 
     */
    @Column(name = "lock_note")
    private String lockNote;

    /**
     * 
     */
    private Boolean locked;

    /**
     * 
     */
    @Column(name = "locker_ref_class")
    private String lockerRefClass;

    /**
     * 
     */
    @Column(name = "locker_ref_id")
    private Long lockerRefId;

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    @Column(name = "original_cost")
    private Double originalCost;

    /**
     * 
     */
    @Column(name = "parent_ref_class")
    private String parentRefClass;

    /**
     * 
     */
    @Column(name = "parent_ref_id")
    private Long parentRefId;

    /**
     * 
     */
    @Column(name = "physical_complete_percent")
    private Double physicalCompletePercent;

    /**
     * 
     */
    @Column(name = "plannable_status")
    private String plannableStatus;

    /**
     * 
     */
    @Column(name = "primary_resource_ref_class")
    private String primaryResourceRefClass;

    /**
     * 
     */
    @Column(name = "primary_resource_ref_id")
    private Long primaryResourceRefId;

    /**
     * 
     */
    @Column(name = "project_ref_class")
    private String projectRefClass;

    /**
     * 
     */
    @Column(name = "project_ref_id")
    private Long projectRefId;

    /**
     * 
     */
    @Column(name = "reend_date")
    private Date reendDate;

    /**
     * 
     */
    @Column(name = "remain_duration_format")
    private String remainDurationFormat;

    /**
     * 
     */
    @Column(name = "remain_duration_millis")
    private Long remainDurationMillis;

    /**
     * 
     */
    @Column(name = "remain_equip_qty")
    private Double remainEquipQty;

    /**
     * 
     */
    @Column(name = "remain_work_qty")
    private Double remainWorkQty;

    /**
     * 
     */
    @Column(name = "restart_date")
    private Date restartDate;

    /**
     * 
     */
    @Column(name = "resume_date")
    private Date resumeDate;

    /**
     * 
     */
    @Column(name = "root_ref_class")
    private String rootRefClass;

    /**
     * 
     */
    @Column(name = "root_ref_id")
    private Long rootRefId;

    /**
     * 
     */
    @Column(name = "suspend_date")
    private Date suspendDate;

    /**
     * 
     */
    @Column(name = "target_duration_format")
    private String targetDurationFormat;

    /**
     * 
     */
    @Column(name = "target_duration_millis")
    private Long targetDurationMillis;

    /**
     * 
     */
    @Column(name = "target_end_date")
    private Date targetEndDate;

    /**
     * 
     */
    @Column(name = "target_equip_qty")
    private Double targetEquipQty;

    /**
     * 
     */
    @Column(name = "target_start_date")
    private Date targetStartDate;

    /**
     * 
     */
    @Column(name = "target_work_qty")
    private Double targetWorkQty;

    /**
     * 
     */
    @Column(name = "task_code")
    private String taskCode;

    /**
     * 
     */
    @Column(name = "total_float")
    private Double totalFloat;

    /**
     * 
     */
    @Column(name = "constraint_date")
    private Date constraintDate;

    /**
     * 
     */
    @Column(name = "constraint_date2")
    private Date constraintDate2;

    /**
     * 
     */
    @Column(name = "date_contraint_type")
    private String dateContraintType;

    /**
     * 
     */
    @Column(name = "date_contraint_type2")
    private String dateContraintType2;

    /**
     * 
     */
    @Column(name = "default_duration_type")
    private String defaultDurationType;

    /**
     * 
     */
    @Column(name = "editor_ref_class")
    private String editorRefClass;

    /**
     * 
     */
    @Column(name = "editor_ref_id")
    private Long editorRefId;

    /**
     * 
     */
    @Column(name = "has_deliverable")
    private Boolean hasDeliverable;

    /**
     * 
     */
    @Column(name = "ltdtype_definition_ref_class")
    private String ltdtypeDefinitionRefClass;

    /**
     * 
     */
    @Column(name = "ltdtype_definition_ref_id")
    private Long ltdtypeDefinitionRefId;

    /**
     * 
     */
    @Column(name = "open_task_date")
    private Date openTaskDate;

    /**
     * 
     */
    @Column(name = "owner_class")
    private String ownerClass;

    /**
     * 
     */
    @Column(name = "owner_id")
    private Long ownerId;

    /**
     * 
     */
    @Column(name = "plannable_priority_type")
    private String plannablePriorityType;

    /**
     * 
     */
    @Column(name = "review_end_date")
    private Date reviewEndDate;

    /**
     * 
     */
    @Column(name = "reviewer_ref_class")
    private String reviewerRefClass;

    /**
     * 
     */
    @Column(name = "reviewer_ref_id")
    private Long reviewerRefId;

    /**
     * 
     */
    @Column(name = "standard_duration_format")
    private String standardDurationFormat;

    /**
     * 
     */
    @Column(name = "standard_duration_millis")
    private Long standardDurationMillis;

    /**
     * 
     */
    @Column(name = "standard_work_qty")
    private Double standardWorkQty;

    /**
     * 
     */
    @Column(name = "default_reviewpoint_type")
    private String defaultReviewpointType;

    /**
     * 
     */
    @Column(name = "releaser_ref_class")
    private String releaserRefClass;

    /**
     * 
     */
    @Column(name = "releaser_ref_id")
    private Long releaserRefId;

    /**
     * 
     */
    @Column(name = "andon_status")
    private String andonStatus;

    /**
     * 
     */
    @Column(name = "task_code2")
    private String taskCode2;

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
    public String getCreatorRefClass() {
        return creatorRefClass;
    }

    /**
     * 
     */
    public void setCreatorRefClass(String creatorRefClass) {
        this.creatorRefClass = creatorRefClass;
    }

    /**
     * 
     */
    public Long getCreatorRefId() {
        return creatorRefId;
    }

    /**
     * 
     */
    public void setCreatorRefId(Long creatorRefId) {
        this.creatorRefId = creatorRefId;
    }

    /**
     * 
     */
    public String getModifierRefClass() {
        return modifierRefClass;
    }

    /**
     * 
     */
    public void setModifierRefClass(String modifierRefClass) {
        this.modifierRefClass = modifierRefClass;
    }

    /**
     * 
     */
    public Long getModifierRefId() {
        return modifierRefId;
    }

    /**
     * 
     */
    public void setModifierRefId(Long modifierRefId) {
        this.modifierRefId = modifierRefId;
    }

    /**
     * 
     */
    public String getActivityType() {
        return activityType;
    }

    /**
     * 
     */
    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }

    /**
     * 
     */
    public String getActualDurationFormat() {
        return actualDurationFormat;
    }

    /**
     * 
     */
    public void setActualDurationFormat(String actualDurationFormat) {
        this.actualDurationFormat = actualDurationFormat;
    }

    /**
     * 
     */
    public Long getActualDurationMillis() {
        return actualDurationMillis;
    }

    /**
     * 
     */
    public void setActualDurationMillis(Long actualDurationMillis) {
        this.actualDurationMillis = actualDurationMillis;
    }

    /**
     * 
     */
    public Date getActualEndDate() {
        return actualEndDate;
    }

    /**
     * 
     */
    public void setActualEndDate(Date actualEndDate) {
        this.actualEndDate = actualEndDate;
    }

    /**
     * 
     */
    public Double getActualEquipQty() {
        return actualEquipQty;
    }

    /**
     * 
     */
    public void setActualEquipQty(Double actualEquipQty) {
        this.actualEquipQty = actualEquipQty;
    }

    /**
     * 
     */
    public Date getActualStartDate() {
        return actualStartDate;
    }

    /**
     * 
     */
    public void setActualStartDate(Date actualStartDate) {
        this.actualStartDate = actualStartDate;
    }

    /**
     * 
     */
    public Double getActualWorkQty() {
        return actualWorkQty;
    }

    /**
     * 
     */
    public void setActualWorkQty(Double actualWorkQty) {
        this.actualWorkQty = actualWorkQty;
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
    public Boolean getControlUpdatesFlag() {
        return controlUpdatesFlag;
    }

    /**
     * 
     */
    public void setControlUpdatesFlag(Boolean controlUpdatesFlag) {
        this.controlUpdatesFlag = controlUpdatesFlag;
    }

    /**
     * 
     */
    public Boolean getCritical() {
        return critical;
    }

    /**
     * 
     */
    public void setCritical(Boolean critical) {
        this.critical = critical;
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
    public Boolean getDrivingPathFlag() {
        return drivingPathFlag;
    }

    /**
     * 
     */
    public void setDrivingPathFlag(Boolean drivingPathFlag) {
        this.drivingPathFlag = drivingPathFlag;
    }

    /**
     * 
     */
    public Date getEarlyEndDate() {
        return earlyEndDate;
    }

    /**
     * 
     */
    public void setEarlyEndDate(Date earlyEndDate) {
        this.earlyEndDate = earlyEndDate;
    }

    /**
     * 
     */
    public Date getEarlyStartDate() {
        return earlyStartDate;
    }

    /**
     * 
     */
    public void setEarlyStartDate(Date earlyStartDate) {
        this.earlyStartDate = earlyStartDate;
    }

    /**
     * 
     */
    public Date getExpectEndDate() {
        return expectEndDate;
    }

    /**
     * 
     */
    public void setExpectEndDate(Date expectEndDate) {
        this.expectEndDate = expectEndDate;
    }

    /**
     * 
     */
    public Double getFreeFloat() {
        return freeFloat;
    }

    /**
     * 
     */
    public void setFreeFloat(Double freeFloat) {
        this.freeFloat = freeFloat;
    }

    /**
     * 
     */
    public String getHealthStatusDescription() {
        return healthStatusDescription;
    }

    /**
     * 
     */
    public void setHealthStatusDescription(String healthStatusDescription) {
        this.healthStatusDescription = healthStatusDescription;
    }

    /**
     * 
     */
    public String getHealthStatusType() {
        return healthStatusType;
    }

    /**
     * 
     */
    public void setHealthStatusType(String healthStatusType) {
        this.healthStatusType = healthStatusType;
    }

    /**
     * 
     */
    public Integer getInternalIndex() {
        return internalIndex;
    }

    /**
     * 
     */
    public void setInternalIndex(Integer internalIndex) {
        this.internalIndex = internalIndex;
    }

    /**
     * 
     */
    public Date getLateEndDate() {
        return lateEndDate;
    }

    /**
     * 
     */
    public void setLateEndDate(Date lateEndDate) {
        this.lateEndDate = lateEndDate;
    }

    /**
     * 
     */
    public Date getLateStartDate() {
        return lateStartDate;
    }

    /**
     * 
     */
    public void setLateStartDate(Date lateStartDate) {
        this.lateStartDate = lateStartDate;
    }

    /**
     * 
     */
    public Integer getLineNumber() {
        return lineNumber;
    }

    /**
     * 
     */
    public void setLineNumber(Integer lineNumber) {
        this.lineNumber = lineNumber;
    }

    /**
     * 
     */
    public Date getLockDate() {
        return lockDate;
    }

    /**
     * 
     */
    public void setLockDate(Date lockDate) {
        this.lockDate = lockDate;
    }

    /**
     * 
     */
    public String getLockNote() {
        return lockNote;
    }

    /**
     * 
     */
    public void setLockNote(String lockNote) {
        this.lockNote = lockNote;
    }

    /**
     * 
     */
    public Boolean getLocked() {
        return locked;
    }

    /**
     * 
     */
    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    /**
     * 
     */
    public String getLockerRefClass() {
        return lockerRefClass;
    }

    /**
     * 
     */
    public void setLockerRefClass(String lockerRefClass) {
        this.lockerRefClass = lockerRefClass;
    }

    /**
     * 
     */
    public Long getLockerRefId() {
        return lockerRefId;
    }

    /**
     * 
     */
    public void setLockerRefId(Long lockerRefId) {
        this.lockerRefId = lockerRefId;
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
    public Double getOriginalCost() {
        return originalCost;
    }

    /**
     * 
     */
    public void setOriginalCost(Double originalCost) {
        this.originalCost = originalCost;
    }

    /**
     * 
     */
    public String getParentRefClass() {
        return parentRefClass;
    }

    /**
     * 
     */
    public void setParentRefClass(String parentRefClass) {
        this.parentRefClass = parentRefClass;
    }

    /**
     * 
     */
    public Long getParentRefId() {
        return parentRefId;
    }

    /**
     * 
     */
    public void setParentRefId(Long parentRefId) {
        this.parentRefId = parentRefId;
    }

    /**
     * 
     */
    public Double getPhysicalCompletePercent() {
        return physicalCompletePercent;
    }

    /**
     * 
     */
    public void setPhysicalCompletePercent(Double physicalCompletePercent) {
        this.physicalCompletePercent = physicalCompletePercent;
    }

    /**
     * 
     */
    public String getPlannableStatus() {
        return plannableStatus;
    }

    /**
     * 
     */
    public void setPlannableStatus(String plannableStatus) {
        this.plannableStatus = plannableStatus;
    }

    /**
     * 
     */
    public String getPrimaryResourceRefClass() {
        return primaryResourceRefClass;
    }

    /**
     * 
     */
    public void setPrimaryResourceRefClass(String primaryResourceRefClass) {
        this.primaryResourceRefClass = primaryResourceRefClass;
    }

    /**
     * 
     */
    public Long getPrimaryResourceRefId() {
        return primaryResourceRefId;
    }

    /**
     * 
     */
    public void setPrimaryResourceRefId(Long primaryResourceRefId) {
        this.primaryResourceRefId = primaryResourceRefId;
    }

    /**
     * 
     */
    public String getProjectRefClass() {
        return projectRefClass;
    }

    /**
     * 
     */
    public void setProjectRefClass(String projectRefClass) {
        this.projectRefClass = projectRefClass;
    }

    /**
     * 
     */
    public Long getProjectRefId() {
        return projectRefId;
    }

    /**
     * 
     */
    public void setProjectRefId(Long projectRefId) {
        this.projectRefId = projectRefId;
    }

    /**
     * 
     */
    public Date getReendDate() {
        return reendDate;
    }

    /**
     * 
     */
    public void setReendDate(Date reendDate) {
        this.reendDate = reendDate;
    }

    /**
     * 
     */
    public String getRemainDurationFormat() {
        return remainDurationFormat;
    }

    /**
     * 
     */
    public void setRemainDurationFormat(String remainDurationFormat) {
        this.remainDurationFormat = remainDurationFormat;
    }

    /**
     * 
     */
    public Long getRemainDurationMillis() {
        return remainDurationMillis;
    }

    /**
     * 
     */
    public void setRemainDurationMillis(Long remainDurationMillis) {
        this.remainDurationMillis = remainDurationMillis;
    }

    /**
     * 
     */
    public Double getRemainEquipQty() {
        return remainEquipQty;
    }

    /**
     * 
     */
    public void setRemainEquipQty(Double remainEquipQty) {
        this.remainEquipQty = remainEquipQty;
    }

    /**
     * 
     */
    public Double getRemainWorkQty() {
        return remainWorkQty;
    }

    /**
     * 
     */
    public void setRemainWorkQty(Double remainWorkQty) {
        this.remainWorkQty = remainWorkQty;
    }

    /**
     * 
     */
    public Date getRestartDate() {
        return restartDate;
    }

    /**
     * 
     */
    public void setRestartDate(Date restartDate) {
        this.restartDate = restartDate;
    }

    /**
     * 
     */
    public Date getResumeDate() {
        return resumeDate;
    }

    /**
     * 
     */
    public void setResumeDate(Date resumeDate) {
        this.resumeDate = resumeDate;
    }

    /**
     * 
     */
    public String getRootRefClass() {
        return rootRefClass;
    }

    /**
     * 
     */
    public void setRootRefClass(String rootRefClass) {
        this.rootRefClass = rootRefClass;
    }

    /**
     * 
     */
    public Long getRootRefId() {
        return rootRefId;
    }

    /**
     * 
     */
    public void setRootRefId(Long rootRefId) {
        this.rootRefId = rootRefId;
    }

    /**
     * 
     */
    public Date getSuspendDate() {
        return suspendDate;
    }

    /**
     * 
     */
    public void setSuspendDate(Date suspendDate) {
        this.suspendDate = suspendDate;
    }

    /**
     * 
     */
    public String getTargetDurationFormat() {
        return targetDurationFormat;
    }

    /**
     * 
     */
    public void setTargetDurationFormat(String targetDurationFormat) {
        this.targetDurationFormat = targetDurationFormat;
    }

    /**
     * 
     */
    public Long getTargetDurationMillis() {
        return targetDurationMillis;
    }

    /**
     * 
     */
    public void setTargetDurationMillis(Long targetDurationMillis) {
        this.targetDurationMillis = targetDurationMillis;
    }

    /**
     * 
     */
    public Date getTargetEndDate() {
        return targetEndDate;
    }

    /**
     * 
     */
    public void setTargetEndDate(Date targetEndDate) {
        this.targetEndDate = targetEndDate;
    }

    /**
     * 
     */
    public Double getTargetEquipQty() {
        return targetEquipQty;
    }

    /**
     * 
     */
    public void setTargetEquipQty(Double targetEquipQty) {
        this.targetEquipQty = targetEquipQty;
    }

    /**
     * 
     */
    public Date getTargetStartDate() {
        return targetStartDate;
    }

    /**
     * 
     */
    public void setTargetStartDate(Date targetStartDate) {
        this.targetStartDate = targetStartDate;
    }

    /**
     * 
     */
    public Double getTargetWorkQty() {
        return targetWorkQty;
    }

    /**
     * 
     */
    public void setTargetWorkQty(Double targetWorkQty) {
        this.targetWorkQty = targetWorkQty;
    }

    /**
     * 
     */
    public String getTaskCode() {
        return taskCode;
    }

    /**
     * 
     */
    public void setTaskCode(String taskCode) {
        this.taskCode = taskCode;
    }

    /**
     * 
     */
    public Double getTotalFloat() {
        return totalFloat;
    }

    /**
     * 
     */
    public void setTotalFloat(Double totalFloat) {
        this.totalFloat = totalFloat;
    }

    /**
     * 
     */
    public Date getConstraintDate() {
        return constraintDate;
    }

    /**
     * 
     */
    public void setConstraintDate(Date constraintDate) {
        this.constraintDate = constraintDate;
    }

    /**
     * 
     */
    public Date getConstraintDate2() {
        return constraintDate2;
    }

    /**
     * 
     */
    public void setConstraintDate2(Date constraintDate2) {
        this.constraintDate2 = constraintDate2;
    }

    /**
     * 
     */
    public String getDateContraintType() {
        return dateContraintType;
    }

    /**
     * 
     */
    public void setDateContraintType(String dateContraintType) {
        this.dateContraintType = dateContraintType;
    }

    /**
     * 
     */
    public String getDateContraintType2() {
        return dateContraintType2;
    }

    /**
     * 
     */
    public void setDateContraintType2(String dateContraintType2) {
        this.dateContraintType2 = dateContraintType2;
    }

    /**
     * 
     */
    public String getDefaultDurationType() {
        return defaultDurationType;
    }

    /**
     * 
     */
    public void setDefaultDurationType(String defaultDurationType) {
        this.defaultDurationType = defaultDurationType;
    }

    /**
     * 
     */
    public String getEditorRefClass() {
        return editorRefClass;
    }

    /**
     * 
     */
    public void setEditorRefClass(String editorRefClass) {
        this.editorRefClass = editorRefClass;
    }

    /**
     * 
     */
    public Long getEditorRefId() {
        return editorRefId;
    }

    /**
     * 
     */
    public void setEditorRefId(Long editorRefId) {
        this.editorRefId = editorRefId;
    }

    /**
     * 
     */
    public Boolean getHasDeliverable() {
        return hasDeliverable;
    }

    /**
     * 
     */
    public void setHasDeliverable(Boolean hasDeliverable) {
        this.hasDeliverable = hasDeliverable;
    }

    /**
     * 
     */
    public String getLtdtypeDefinitionRefClass() {
        return ltdtypeDefinitionRefClass;
    }

    /**
     * 
     */
    public void setLtdtypeDefinitionRefClass(String ltdtypeDefinitionRefClass) {
        this.ltdtypeDefinitionRefClass = ltdtypeDefinitionRefClass;
    }

    /**
     * 
     */
    public Long getLtdtypeDefinitionRefId() {
        return ltdtypeDefinitionRefId;
    }

    /**
     * 
     */
    public void setLtdtypeDefinitionRefId(Long ltdtypeDefinitionRefId) {
        this.ltdtypeDefinitionRefId = ltdtypeDefinitionRefId;
    }

    /**
     * 
     */
    public Date getOpenTaskDate() {
        return openTaskDate;
    }

    /**
     * 
     */
    public void setOpenTaskDate(Date openTaskDate) {
        this.openTaskDate = openTaskDate;
    }

    /**
     * 
     */
    public String getOwnerClass() {
        return ownerClass;
    }

    /**
     * 
     */
    public void setOwnerClass(String ownerClass) {
        this.ownerClass = ownerClass;
    }

    /**
     * 
     */
    public Long getOwnerId() {
        return ownerId;
    }

    /**
     * 
     */
    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * 
     */
    public String getPlannablePriorityType() {
        return plannablePriorityType;
    }

    /**
     * 
     */
    public void setPlannablePriorityType(String plannablePriorityType) {
        this.plannablePriorityType = plannablePriorityType;
    }

    /**
     * 
     */
    public Date getReviewEndDate() {
        return reviewEndDate;
    }

    /**
     * 
     */
    public void setReviewEndDate(Date reviewEndDate) {
        this.reviewEndDate = reviewEndDate;
    }

    /**
     * 
     */
    public String getReviewerRefClass() {
        return reviewerRefClass;
    }

    /**
     * 
     */
    public void setReviewerRefClass(String reviewerRefClass) {
        this.reviewerRefClass = reviewerRefClass;
    }

    /**
     * 
     */
    public Long getReviewerRefId() {
        return reviewerRefId;
    }

    /**
     * 
     */
    public void setReviewerRefId(Long reviewerRefId) {
        this.reviewerRefId = reviewerRefId;
    }

    /**
     * 
     */
    public String getStandardDurationFormat() {
        return standardDurationFormat;
    }

    /**
     * 
     */
    public void setStandardDurationFormat(String standardDurationFormat) {
        this.standardDurationFormat = standardDurationFormat;
    }

    /**
     * 
     */
    public Long getStandardDurationMillis() {
        return standardDurationMillis;
    }

    /**
     * 
     */
    public void setStandardDurationMillis(Long standardDurationMillis) {
        this.standardDurationMillis = standardDurationMillis;
    }

    /**
     * 
     */
    public Double getStandardWorkQty() {
        return standardWorkQty;
    }

    /**
     * 
     */
    public void setStandardWorkQty(Double standardWorkQty) {
        this.standardWorkQty = standardWorkQty;
    }

    /**
     * 
     */
    public String getDefaultReviewpointType() {
        return defaultReviewpointType;
    }

    /**
     * 
     */
    public void setDefaultReviewpointType(String defaultReviewpointType) {
        this.defaultReviewpointType = defaultReviewpointType;
    }

    /**
     * 
     */
    public String getReleaserRefClass() {
        return releaserRefClass;
    }

    /**
     * 
     */
    public void setReleaserRefClass(String releaserRefClass) {
        this.releaserRefClass = releaserRefClass;
    }

    /**
     * 
     */
    public Long getReleaserRefId() {
        return releaserRefId;
    }

    /**
     * 
     */
    public void setReleaserRefId(Long releaserRefId) {
        this.releaserRefId = releaserRefId;
    }

    /**
     * 
     */
    public String getAndonStatus() {
        return andonStatus;
    }

    /**
     * 
     */
    public void setAndonStatus(String andonStatus) {
        this.andonStatus = andonStatus;
    }

    /**
     * 
     */
    public String getTaskCode2() {
        return taskCode2;
    }

    /**
     * 
     */
    public void setTaskCode2(String taskCode2) {
        this.taskCode2 = taskCode2;
    }
}