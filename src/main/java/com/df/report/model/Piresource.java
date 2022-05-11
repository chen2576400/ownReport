package com.df.report.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * 
 * @TableName piresource
 */
@Entity
public class Piresource implements Serializable {
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
    @Column(name = "active_flag")
    private Boolean activeFlag;

    /**
     * 
     */
    @Column(name = "auto_compute_actual_flag")
    private Boolean autoComputeActualFlag;

    /**
     * 
     */
    @Column(name = "calendar_ref_class")
    private String calendarRefClass;

    /**
     * 
     */
    @Column(name = "calendar_ref_id")
    private Long calendarRefId;

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
    @Column(name = "currency_type_ref_class")
    private String currencyTypeRefClass;

    /**
     * 
     */
    @Column(name = "currency_type_ref_id")
    private Long currencyTypeRefId;

    /**
     * 
     */
    @Column(name = "default_cost_qty_link_flag")
    private Boolean defaultCostQtyLinkFlag;

    /**
     * 
     */
    @Column(name = "default_qty_per_hour")
    private Double defaultQtyPerHour;

    /**
     * 
     */
    @Column(name = "last_checksum")
    private Integer lastChecksum;

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    @Column(name = "overtime_factor")
    private Double overtimeFactor;

    /**
     * 
     */
    @Column(name = "overtime_flag")
    private Boolean overtimeFlag;

    /**
     * 
     */
    @Column(name = "parent_resource_ref_class")
    private String parentResourceRefClass;

    /**
     * 
     */
    @Column(name = "parent_resource_ref_id")
    private Long parentResourceRefId;

    /**
     * 
     */
    @Column(name = "cost_qty_type")
    private String costQtyType;

    /**
     * 
     */
    @Column(name = "resource_notes")
    private String resourceNotes;

    /**
     * 
     */
    @Column(name = "resource_seq_num")
    private Integer resourceSeqNum;

    /**
     * 
     */
    @Column(name = "resource_short_name")
    private String resourceShortName;

    /**
     * 
     */
    @Column(name = "resource_title_name")
    private String resourceTitleName;

    /**
     * 
     */
    @Column(name = "resource_type")
    private String resourceType;

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
    @Column(name = "shift_ref_class")
    private String shiftRefClass;

    /**
     * 
     */
    @Column(name = "shift_ref_id")
    private Long shiftRefId;

    /**
     * 
     */
    @Column(name = "timesheet_approve_user_ref_class")
    private String timesheetApproveUserRefClass;

    /**
     * 
     */
    @Column(name = "timesheet_approve_user_ref_id")
    private Long timesheetApproveUserRefId;

    /**
     * 
     */
    @Column(name = "timesheet_flag")
    private Boolean timesheetFlag;

    /**
     * 
     */
    @Column(name = "unit_ref_class")
    private String unitRefClass;

    /**
     * 
     */
    @Column(name = "unit_ref_id")
    private Long unitRefId;

    /**
     * 
     */
    @Column(name = "user_ref_class")
    private String userRefClass;

    /**
     * 
     */
    @Column(name = "user_ref_id")
    private Long userRefId;

    /**
     * 
     */
    @Column(name = "xfer_complete_day_count")
    private Integer xferCompleteDayCount;

    /**
     * 
     */
    @Column(name = "xfer_not_start_day_count")
    private Integer xferNotStartDayCount;

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
    public Boolean getActiveFlag() {
        return activeFlag;
    }

    /**
     * 
     */
    public void setActiveFlag(Boolean activeFlag) {
        this.activeFlag = activeFlag;
    }

    /**
     * 
     */
    public Boolean getAutoComputeActualFlag() {
        return autoComputeActualFlag;
    }

    /**
     * 
     */
    public void setAutoComputeActualFlag(Boolean autoComputeActualFlag) {
        this.autoComputeActualFlag = autoComputeActualFlag;
    }

    /**
     * 
     */
    public String getCalendarRefClass() {
        return calendarRefClass;
    }

    /**
     * 
     */
    public void setCalendarRefClass(String calendarRefClass) {
        this.calendarRefClass = calendarRefClass;
    }

    /**
     * 
     */
    public Long getCalendarRefId() {
        return calendarRefId;
    }

    /**
     * 
     */
    public void setCalendarRefId(Long calendarRefId) {
        this.calendarRefId = calendarRefId;
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
    public String getCurrencyTypeRefClass() {
        return currencyTypeRefClass;
    }

    /**
     * 
     */
    public void setCurrencyTypeRefClass(String currencyTypeRefClass) {
        this.currencyTypeRefClass = currencyTypeRefClass;
    }

    /**
     * 
     */
    public Long getCurrencyTypeRefId() {
        return currencyTypeRefId;
    }

    /**
     * 
     */
    public void setCurrencyTypeRefId(Long currencyTypeRefId) {
        this.currencyTypeRefId = currencyTypeRefId;
    }

    /**
     * 
     */
    public Boolean getDefaultCostQtyLinkFlag() {
        return defaultCostQtyLinkFlag;
    }

    /**
     * 
     */
    public void setDefaultCostQtyLinkFlag(Boolean defaultCostQtyLinkFlag) {
        this.defaultCostQtyLinkFlag = defaultCostQtyLinkFlag;
    }

    /**
     * 
     */
    public Double getDefaultQtyPerHour() {
        return defaultQtyPerHour;
    }

    /**
     * 
     */
    public void setDefaultQtyPerHour(Double defaultQtyPerHour) {
        this.defaultQtyPerHour = defaultQtyPerHour;
    }

    /**
     * 
     */
    public Integer getLastChecksum() {
        return lastChecksum;
    }

    /**
     * 
     */
    public void setLastChecksum(Integer lastChecksum) {
        this.lastChecksum = lastChecksum;
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
    public Double getOvertimeFactor() {
        return overtimeFactor;
    }

    /**
     * 
     */
    public void setOvertimeFactor(Double overtimeFactor) {
        this.overtimeFactor = overtimeFactor;
    }

    /**
     * 
     */
    public Boolean getOvertimeFlag() {
        return overtimeFlag;
    }

    /**
     * 
     */
    public void setOvertimeFlag(Boolean overtimeFlag) {
        this.overtimeFlag = overtimeFlag;
    }

    /**
     * 
     */
    public String getParentResourceRefClass() {
        return parentResourceRefClass;
    }

    /**
     * 
     */
    public void setParentResourceRefClass(String parentResourceRefClass) {
        this.parentResourceRefClass = parentResourceRefClass;
    }

    /**
     * 
     */
    public Long getParentResourceRefId() {
        return parentResourceRefId;
    }

    /**
     * 
     */
    public void setParentResourceRefId(Long parentResourceRefId) {
        this.parentResourceRefId = parentResourceRefId;
    }

    /**
     * 
     */
    public String getCostQtyType() {
        return costQtyType;
    }

    /**
     * 
     */
    public void setCostQtyType(String costQtyType) {
        this.costQtyType = costQtyType;
    }

    /**
     * 
     */
    public String getResourceNotes() {
        return resourceNotes;
    }

    /**
     * 
     */
    public void setResourceNotes(String resourceNotes) {
        this.resourceNotes = resourceNotes;
    }

    /**
     * 
     */
    public Integer getResourceSeqNum() {
        return resourceSeqNum;
    }

    /**
     * 
     */
    public void setResourceSeqNum(Integer resourceSeqNum) {
        this.resourceSeqNum = resourceSeqNum;
    }

    /**
     * 
     */
    public String getResourceShortName() {
        return resourceShortName;
    }

    /**
     * 
     */
    public void setResourceShortName(String resourceShortName) {
        this.resourceShortName = resourceShortName;
    }

    /**
     * 
     */
    public String getResourceTitleName() {
        return resourceTitleName;
    }

    /**
     * 
     */
    public void setResourceTitleName(String resourceTitleName) {
        this.resourceTitleName = resourceTitleName;
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
    public String getShiftRefClass() {
        return shiftRefClass;
    }

    /**
     * 
     */
    public void setShiftRefClass(String shiftRefClass) {
        this.shiftRefClass = shiftRefClass;
    }

    /**
     * 
     */
    public Long getShiftRefId() {
        return shiftRefId;
    }

    /**
     * 
     */
    public void setShiftRefId(Long shiftRefId) {
        this.shiftRefId = shiftRefId;
    }

    /**
     * 
     */
    public String getTimesheetApproveUserRefClass() {
        return timesheetApproveUserRefClass;
    }

    /**
     * 
     */
    public void setTimesheetApproveUserRefClass(String timesheetApproveUserRefClass) {
        this.timesheetApproveUserRefClass = timesheetApproveUserRefClass;
    }

    /**
     * 
     */
    public Long getTimesheetApproveUserRefId() {
        return timesheetApproveUserRefId;
    }

    /**
     * 
     */
    public void setTimesheetApproveUserRefId(Long timesheetApproveUserRefId) {
        this.timesheetApproveUserRefId = timesheetApproveUserRefId;
    }

    /**
     * 
     */
    public Boolean getTimesheetFlag() {
        return timesheetFlag;
    }

    /**
     * 
     */
    public void setTimesheetFlag(Boolean timesheetFlag) {
        this.timesheetFlag = timesheetFlag;
    }

    /**
     * 
     */
    public String getUnitRefClass() {
        return unitRefClass;
    }

    /**
     * 
     */
    public void setUnitRefClass(String unitRefClass) {
        this.unitRefClass = unitRefClass;
    }

    /**
     * 
     */
    public Long getUnitRefId() {
        return unitRefId;
    }

    /**
     * 
     */
    public void setUnitRefId(Long unitRefId) {
        this.unitRefId = unitRefId;
    }

    /**
     * 
     */
    public String getUserRefClass() {
        return userRefClass;
    }

    /**
     * 
     */
    public void setUserRefClass(String userRefClass) {
        this.userRefClass = userRefClass;
    }

    /**
     * 
     */
    public Long getUserRefId() {
        return userRefId;
    }

    /**
     * 
     */
    public void setUserRefId(Long userRefId) {
        this.userRefId = userRefId;
    }

    /**
     * 
     */
    public Integer getXferCompleteDayCount() {
        return xferCompleteDayCount;
    }

    /**
     * 
     */
    public void setXferCompleteDayCount(Integer xferCompleteDayCount) {
        this.xferCompleteDayCount = xferCompleteDayCount;
    }

    /**
     * 
     */
    public Integer getXferNotStartDayCount() {
        return xferNotStartDayCount;
    }

    /**
     * 
     */
    public void setXferNotStartDayCount(Integer xferNotStartDayCount) {
        this.xferNotStartDayCount = xferNotStartDayCount;
    }
}