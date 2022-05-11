package com.df.report.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * 
 * @TableName stexpected_finish_time
 */
@Entity
public class StexpectedFinishTime implements Serializable {
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
    @Column(name = "expected_finish_time")
    private Date expectedFinishTime;

    /**
     * 
     */
    @Column(name = "plan_activity_ref_class")
    private String planActivityRefClass;

    /**
     * 
     */
    @Column(name = "plan_activity_ref_id")
    private Long planActivityRefId;

    /**
     * 
     */
    @Column(name = "plan_ref_class")
    private String planRefClass;

    /**
     * 
     */
    @Column(name = "plan_ref_id")
    private Long planRefId;

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
    @Column(name = "report_time")
    private Date reportTime;

    /**
     * 
     */
    @Column(name = "reporter_ref_class")
    private String reporterRefClass;

    /**
     * 
     */
    @Column(name = "reporter_ref_id")
    private Long reporterRefId;

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
    public Date getExpectedFinishTime() {
        return expectedFinishTime;
    }

    /**
     * 
     */
    public void setExpectedFinishTime(Date expectedFinishTime) {
        this.expectedFinishTime = expectedFinishTime;
    }

    /**
     * 
     */
    public String getPlanActivityRefClass() {
        return planActivityRefClass;
    }

    /**
     * 
     */
    public void setPlanActivityRefClass(String planActivityRefClass) {
        this.planActivityRefClass = planActivityRefClass;
    }

    /**
     * 
     */
    public Long getPlanActivityRefId() {
        return planActivityRefId;
    }

    /**
     * 
     */
    public void setPlanActivityRefId(Long planActivityRefId) {
        this.planActivityRefId = planActivityRefId;
    }

    /**
     * 
     */
    public String getPlanRefClass() {
        return planRefClass;
    }

    /**
     * 
     */
    public void setPlanRefClass(String planRefClass) {
        this.planRefClass = planRefClass;
    }

    /**
     * 
     */
    public Long getPlanRefId() {
        return planRefId;
    }

    /**
     * 
     */
    public void setPlanRefId(Long planRefId) {
        this.planRefId = planRefId;
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
    public Date getReportTime() {
        return reportTime;
    }

    /**
     * 
     */
    public void setReportTime(Date reportTime) {
        this.reportTime = reportTime;
    }

    /**
     * 
     */
    public String getReporterRefClass() {
        return reporterRefClass;
    }

    /**
     * 
     */
    public void setReporterRefClass(String reporterRefClass) {
        this.reporterRefClass = reporterRefClass;
    }

    /**
     * 
     */
    public Long getReporterRefId() {
        return reporterRefId;
    }

    /**
     * 
     */
    public void setReporterRefId(Long reporterRefId) {
        this.reporterRefId = reporterRefId;
    }
}