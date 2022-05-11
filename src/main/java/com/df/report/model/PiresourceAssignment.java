package com.df.report.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * 
 * @TableName piresource_assignment
 */
@Entity
public class PiresourceAssignment implements Serializable {
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
    @Column(name = "account_ref_class")
    private String accountRefClass;

    /**
     * 
     */
    @Column(name = "account_ref_id")
    private Long accountRefId;

    /**
     * 
     */
    @Column(name = "actual_end_date")
    private Date actualEndDate;

    /**
     * 
     */
    @Column(name = "actual_overtime_cost")
    private Double actualOvertimeCost;

    /**
     * 
     */
    @Column(name = "actual_overtime_qty")
    private Double actualOvertimeQty;

    /**
     * 
     */
    @Column(name = "actual_regular_cost")
    private Double actualRegularCost;

    /**
     * 
     */
    @Column(name = "actual_regular_qty")
    private Double actualRegularQty;

    /**
     * 
     */
    @Column(name = "actual_start_date")
    private Date actualStartDate;

    /**
     * 
     */
    @Column(name = "actual_this_per_cost")
    private Double actualThisPerCost;

    /**
     * 
     */
    @Column(name = "actual_this_per_qty")
    private Double actualThisPerQty;

    /**
     * 
     */
    @Column(name = "allocation_percentage")
    private Double allocationPercentage;

    /**
     * 
     */
    @Column(name = "assignment_state")
    private String assignmentState;

    /**
     * 
     */
    @Column(name = "assignment_type")
    private String assignmentType;

    /**
     * 
     */
    @Column(name = "cost_per_qty")
    private Double costPerQty;

    /**
     * 
     */
    @Column(name = "cost_per_qty_source_type")
    private String costPerQtySourceType;

    /**
     * 
     */
    @Column(name = "cost_qty_link_flag")
    private Boolean costQtyLinkFlag;

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
    @Column(name = "open_task_date")
    private Date openTaskDate;

    /**
     * 
     */
    @Column(name = "over_time_factor")
    private Double overTimeFactor;

    /**
     * 
     */
    @Column(name = "pend_actual_overtime_qty")
    private Double pendActualOvertimeQty;

    /**
     * 
     */
    @Column(name = "pend_actual_regular_qty")
    private Double pendActualRegularQty;

    /**
     * 
     */
    @Column(name = "pend_remain_qty")
    private Double pendRemainQty;

    /**
     * 
     */
    @Column(name = "pending_complete_percent")
    private Double pendingCompletePercent;

    /**
     * 
     */
    @Column(name = "plannable_ref_class")
    private String plannableRefClass;

    /**
     * 
     */
    @Column(name = "plannable_ref_id")
    private Long plannableRefId;

    /**
     * 
     */
    @Column(name = "plannable_status")
    private String plannableStatus;

    /**
     * 
     */
    @Column(name = "prior_timesheet_actual_overtime_qty")
    private Double priorTimesheetActualOvertimeQty;

    /**
     * 
     */
    @Column(name = "prior_timesheet_actual_reg_qty")
    private Double priorTimesheetActualRegQty;

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
    @Column(name = "rate_type")
    private String rateType;

    /**
     * 
     */
    @Column(name = "reend_date")
    private Date reendDate;

    /**
     * 
     */
    @Column(name = "relag_duration_format")
    private String relagDurationFormat;

    /**
     * 
     */
    @Column(name = "relag_duration_millis")
    private Long relagDurationMillis;

    /**
     * 
     */
    @Column(name = "remain_cost")
    private Double remainCost;

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
    @Column(name = "remain_qty")
    private Double remainQty;

    /**
     * 
     */
    @Column(name = "remain_qty_per_hour")
    private Double remainQtyPerHour;

    /**
     * 
     */
    @Column(name = "remaining_late_end_date")
    private Date remainingLateEndDate;

    /**
     * 
     */
    @Column(name = "remaining_late_start_date")
    private Date remainingLateStartDate;

    /**
     * 
     */
    @Column(name = "resource_type")
    private String resourceType;

    /**
     * 
     */
    @Column(name = "restart_date")
    private Date restartDate;

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
    @Column(name = "rollup_dates_flag")
    private Boolean rollupDatesFlag;

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
    @Column(name = "rsrc_ref_class")
    private String rsrcRefClass;

    /**
     * 
     */
    @Column(name = "rsrc_ref_id")
    private Long rsrcRefId;

    /**
     * 
     */
    @Column(name = "rsrc_request_data")
    private String rsrcRequestData;

    /**
     * 
     */
    @Column(name = "skill_level")
    private Integer skillLevel;

    /**
     * 
     */
    @Column(name = "target_cost")
    private Double targetCost;

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
    @Column(name = "target_lag_duration_format")
    private String targetLagDurationFormat;

    /**
     * 
     */
    @Column(name = "target_lag_duration_millis")
    private Long targetLagDurationMillis;

    /**
     * 
     */
    @Column(name = "target_qty")
    private Double targetQty;

    /**
     * 
     */
    @Column(name = "target_qty_per_hour")
    private Double targetQtyPerHour;

    /**
     * 
     */
    @Column(name = "target_start_date")
    private Date targetStartDate;

    /**
     * 
     */
    @Column(name = "timesheet_pend_actual_end_flag")
    private Boolean timesheetPendActualEndFlag;

    /**
     * 
     */
    @Column(name = "work_complete_percent")
    private Double workCompletePercent;

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
    public String getAccountRefClass() {
        return accountRefClass;
    }

    /**
     * 
     */
    public void setAccountRefClass(String accountRefClass) {
        this.accountRefClass = accountRefClass;
    }

    /**
     * 
     */
    public Long getAccountRefId() {
        return accountRefId;
    }

    /**
     * 
     */
    public void setAccountRefId(Long accountRefId) {
        this.accountRefId = accountRefId;
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
    public Double getActualOvertimeCost() {
        return actualOvertimeCost;
    }

    /**
     * 
     */
    public void setActualOvertimeCost(Double actualOvertimeCost) {
        this.actualOvertimeCost = actualOvertimeCost;
    }

    /**
     * 
     */
    public Double getActualOvertimeQty() {
        return actualOvertimeQty;
    }

    /**
     * 
     */
    public void setActualOvertimeQty(Double actualOvertimeQty) {
        this.actualOvertimeQty = actualOvertimeQty;
    }

    /**
     * 
     */
    public Double getActualRegularCost() {
        return actualRegularCost;
    }

    /**
     * 
     */
    public void setActualRegularCost(Double actualRegularCost) {
        this.actualRegularCost = actualRegularCost;
    }

    /**
     * 
     */
    public Double getActualRegularQty() {
        return actualRegularQty;
    }

    /**
     * 
     */
    public void setActualRegularQty(Double actualRegularQty) {
        this.actualRegularQty = actualRegularQty;
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
    public Double getActualThisPerCost() {
        return actualThisPerCost;
    }

    /**
     * 
     */
    public void setActualThisPerCost(Double actualThisPerCost) {
        this.actualThisPerCost = actualThisPerCost;
    }

    /**
     * 
     */
    public Double getActualThisPerQty() {
        return actualThisPerQty;
    }

    /**
     * 
     */
    public void setActualThisPerQty(Double actualThisPerQty) {
        this.actualThisPerQty = actualThisPerQty;
    }

    /**
     * 
     */
    public Double getAllocationPercentage() {
        return allocationPercentage;
    }

    /**
     * 
     */
    public void setAllocationPercentage(Double allocationPercentage) {
        this.allocationPercentage = allocationPercentage;
    }

    /**
     * 
     */
    public String getAssignmentState() {
        return assignmentState;
    }

    /**
     * 
     */
    public void setAssignmentState(String assignmentState) {
        this.assignmentState = assignmentState;
    }

    /**
     * 
     */
    public String getAssignmentType() {
        return assignmentType;
    }

    /**
     * 
     */
    public void setAssignmentType(String assignmentType) {
        this.assignmentType = assignmentType;
    }

    /**
     * 
     */
    public Double getCostPerQty() {
        return costPerQty;
    }

    /**
     * 
     */
    public void setCostPerQty(Double costPerQty) {
        this.costPerQty = costPerQty;
    }

    /**
     * 
     */
    public String getCostPerQtySourceType() {
        return costPerQtySourceType;
    }

    /**
     * 
     */
    public void setCostPerQtySourceType(String costPerQtySourceType) {
        this.costPerQtySourceType = costPerQtySourceType;
    }

    /**
     * 
     */
    public Boolean getCostQtyLinkFlag() {
        return costQtyLinkFlag;
    }

    /**
     * 
     */
    public void setCostQtyLinkFlag(Boolean costQtyLinkFlag) {
        this.costQtyLinkFlag = costQtyLinkFlag;
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
    public Double getOverTimeFactor() {
        return overTimeFactor;
    }

    /**
     * 
     */
    public void setOverTimeFactor(Double overTimeFactor) {
        this.overTimeFactor = overTimeFactor;
    }

    /**
     * 
     */
    public Double getPendActualOvertimeQty() {
        return pendActualOvertimeQty;
    }

    /**
     * 
     */
    public void setPendActualOvertimeQty(Double pendActualOvertimeQty) {
        this.pendActualOvertimeQty = pendActualOvertimeQty;
    }

    /**
     * 
     */
    public Double getPendActualRegularQty() {
        return pendActualRegularQty;
    }

    /**
     * 
     */
    public void setPendActualRegularQty(Double pendActualRegularQty) {
        this.pendActualRegularQty = pendActualRegularQty;
    }

    /**
     * 
     */
    public Double getPendRemainQty() {
        return pendRemainQty;
    }

    /**
     * 
     */
    public void setPendRemainQty(Double pendRemainQty) {
        this.pendRemainQty = pendRemainQty;
    }

    /**
     * 
     */
    public Double getPendingCompletePercent() {
        return pendingCompletePercent;
    }

    /**
     * 
     */
    public void setPendingCompletePercent(Double pendingCompletePercent) {
        this.pendingCompletePercent = pendingCompletePercent;
    }

    /**
     * 
     */
    public String getPlannableRefClass() {
        return plannableRefClass;
    }

    /**
     * 
     */
    public void setPlannableRefClass(String plannableRefClass) {
        this.plannableRefClass = plannableRefClass;
    }

    /**
     * 
     */
    public Long getPlannableRefId() {
        return plannableRefId;
    }

    /**
     * 
     */
    public void setPlannableRefId(Long plannableRefId) {
        this.plannableRefId = plannableRefId;
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
    public Double getPriorTimesheetActualOvertimeQty() {
        return priorTimesheetActualOvertimeQty;
    }

    /**
     * 
     */
    public void setPriorTimesheetActualOvertimeQty(Double priorTimesheetActualOvertimeQty) {
        this.priorTimesheetActualOvertimeQty = priorTimesheetActualOvertimeQty;
    }

    /**
     * 
     */
    public Double getPriorTimesheetActualRegQty() {
        return priorTimesheetActualRegQty;
    }

    /**
     * 
     */
    public void setPriorTimesheetActualRegQty(Double priorTimesheetActualRegQty) {
        this.priorTimesheetActualRegQty = priorTimesheetActualRegQty;
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
    public String getRateType() {
        return rateType;
    }

    /**
     * 
     */
    public void setRateType(String rateType) {
        this.rateType = rateType;
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
    public String getRelagDurationFormat() {
        return relagDurationFormat;
    }

    /**
     * 
     */
    public void setRelagDurationFormat(String relagDurationFormat) {
        this.relagDurationFormat = relagDurationFormat;
    }

    /**
     * 
     */
    public Long getRelagDurationMillis() {
        return relagDurationMillis;
    }

    /**
     * 
     */
    public void setRelagDurationMillis(Long relagDurationMillis) {
        this.relagDurationMillis = relagDurationMillis;
    }

    /**
     * 
     */
    public Double getRemainCost() {
        return remainCost;
    }

    /**
     * 
     */
    public void setRemainCost(Double remainCost) {
        this.remainCost = remainCost;
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
    public Double getRemainQty() {
        return remainQty;
    }

    /**
     * 
     */
    public void setRemainQty(Double remainQty) {
        this.remainQty = remainQty;
    }

    /**
     * 
     */
    public Double getRemainQtyPerHour() {
        return remainQtyPerHour;
    }

    /**
     * 
     */
    public void setRemainQtyPerHour(Double remainQtyPerHour) {
        this.remainQtyPerHour = remainQtyPerHour;
    }

    /**
     * 
     */
    public Date getRemainingLateEndDate() {
        return remainingLateEndDate;
    }

    /**
     * 
     */
    public void setRemainingLateEndDate(Date remainingLateEndDate) {
        this.remainingLateEndDate = remainingLateEndDate;
    }

    /**
     * 
     */
    public Date getRemainingLateStartDate() {
        return remainingLateStartDate;
    }

    /**
     * 
     */
    public void setRemainingLateStartDate(Date remainingLateStartDate) {
        this.remainingLateStartDate = remainingLateStartDate;
    }

    /**
     * 
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * 
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
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
    public Boolean getRollupDatesFlag() {
        return rollupDatesFlag;
    }

    /**
     * 
     */
    public void setRollupDatesFlag(Boolean rollupDatesFlag) {
        this.rollupDatesFlag = rollupDatesFlag;
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
    public String getRsrcRefClass() {
        return rsrcRefClass;
    }

    /**
     * 
     */
    public void setRsrcRefClass(String rsrcRefClass) {
        this.rsrcRefClass = rsrcRefClass;
    }

    /**
     * 
     */
    public Long getRsrcRefId() {
        return rsrcRefId;
    }

    /**
     * 
     */
    public void setRsrcRefId(Long rsrcRefId) {
        this.rsrcRefId = rsrcRefId;
    }

    /**
     * 
     */
    public String getRsrcRequestData() {
        return rsrcRequestData;
    }

    /**
     * 
     */
    public void setRsrcRequestData(String rsrcRequestData) {
        this.rsrcRequestData = rsrcRequestData;
    }

    /**
     * 
     */
    public Integer getSkillLevel() {
        return skillLevel;
    }

    /**
     * 
     */
    public void setSkillLevel(Integer skillLevel) {
        this.skillLevel = skillLevel;
    }

    /**
     * 
     */
    public Double getTargetCost() {
        return targetCost;
    }

    /**
     * 
     */
    public void setTargetCost(Double targetCost) {
        this.targetCost = targetCost;
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
    public String getTargetLagDurationFormat() {
        return targetLagDurationFormat;
    }

    /**
     * 
     */
    public void setTargetLagDurationFormat(String targetLagDurationFormat) {
        this.targetLagDurationFormat = targetLagDurationFormat;
    }

    /**
     * 
     */
    public Long getTargetLagDurationMillis() {
        return targetLagDurationMillis;
    }

    /**
     * 
     */
    public void setTargetLagDurationMillis(Long targetLagDurationMillis) {
        this.targetLagDurationMillis = targetLagDurationMillis;
    }

    /**
     * 
     */
    public Double getTargetQty() {
        return targetQty;
    }

    /**
     * 
     */
    public void setTargetQty(Double targetQty) {
        this.targetQty = targetQty;
    }

    /**
     * 
     */
    public Double getTargetQtyPerHour() {
        return targetQtyPerHour;
    }

    /**
     * 
     */
    public void setTargetQtyPerHour(Double targetQtyPerHour) {
        this.targetQtyPerHour = targetQtyPerHour;
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
    public Boolean getTimesheetPendActualEndFlag() {
        return timesheetPendActualEndFlag;
    }

    /**
     * 
     */
    public void setTimesheetPendActualEndFlag(Boolean timesheetPendActualEndFlag) {
        this.timesheetPendActualEndFlag = timesheetPendActualEndFlag;
    }

    /**
     * 
     */
    public Double getWorkCompletePercent() {
        return workCompletePercent;
    }

    /**
     * 
     */
    public void setWorkCompletePercent(Double workCompletePercent) {
        this.workCompletePercent = workCompletePercent;
    }
}