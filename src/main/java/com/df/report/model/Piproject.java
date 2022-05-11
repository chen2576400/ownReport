package com.df.report.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * 
 * @TableName piproject
 */
@Entity
public class Piproject implements Serializable {
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
    @Column(name = "actual_percent_link_flag")
    private Boolean actualPercentLinkFlag;

    /**
     * 
     */
    @Column(name = "actual_this_per_link_flag")
    private Boolean actualThisPerLinkFlag;

    /**
     * 
     */
    @Column(name = "add_actual_remain_flag")
    private Boolean addActualRemainFlag;

    /**
     * 
     */
    @Column(name = "add_by_name")
    private String addByName;

    /**
     * 
     */
    @Column(name = "add_date")
    private Date addDate;

    /**
     * 
     */
    @Column(name = "allow_complete_flag")
    private Boolean allowCompleteFlag;

    /**
     * 
     */
    @Column(name = "allow_neg_actual_flag")
    private Boolean allowNegActualFlag;

    /**
     * 
     */
    @Column(name = "apply_actuals_date")
    private Date applyActualsDate;

    /**
     * 
     */
    @Column(name = "baseline_type_ref_class")
    private String baselineTypeRefClass;

    /**
     * 
     */
    @Column(name = "baseline_type_ref_id")
    private Long baselineTypeRefId;

    /**
     * 
     */
    @Column(name = "batch_sum_flag")
    private Boolean batchSumFlag;

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
    @Column(name = "checkout_date")
    private Date checkoutDate;

    /**
     * 
     */
    @Column(name = "checkout_flag")
    private Boolean checkoutFlag;

    /**
     * 
     */
    @Column(name = "checkout_user_ref_class")
    private String checkoutUserRefClass;

    /**
     * 
     */
    @Column(name = "checkout_user_ref_id")
    private Long checkoutUserRefId;

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
    @Column(name = "cost_qty_recalc_flag")
    private Boolean costQtyRecalcFlag;

    /**
     * 
     */
    @Column(name = "critical_duration_hour_count")
    private Double criticalDurationHourCount;

    /**
     * 
     */
    @Column(name = "critical_path_type")
    private String criticalPathType;

    /**
     * 
     */
    @Column(name = "default_complete_percent_type")
    private String defaultCompletePercentType;

    /**
     * 
     */
    @Column(name = "default_cost_per_qty")
    private Double defaultCostPerQty;

    /**
     * 
     */
    @Column(name = "default_duration_type")
    private String defaultDurationType;

    /**
     * 
     */
    @Column(name = "default_qty_type")
    private String defaultQtyType;

    /**
     * 
     */
    @Column(name = "default_rate_type")
    private String defaultRateType;

    /**
     * 
     */
    @Column(name = "default_rollup_dates_flag")
    private Boolean defaultRollupDatesFlag;

    /**
     * 
     */
    @Column(name = "default_task_type")
    private String defaultTaskType;

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
    @Column(name = "fiscal_year_start_month_num")
    private Integer fiscalYearStartMonthNum;

    /**
     * 
     */
    @Column(name = "forecast_start_date")
    private Date forecastStartDate;

    /**
     * 
     */
    @Column(name = "hist_interval")
    private String histInterval;

    /**
     * 
     */
    @Column(name = "hist_level")
    private String histLevel;

    /**
     * 
     */
    @Column(name = "intg_project_type")
    private String intgProjectType;

    /**
     * 
     */
    @Column(name = "is_template")
    private Boolean isTemplate;

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
    @Column(name = "last_baseline_update_date")
    private Date lastBaselineUpdateDate;

    /**
     * 
     */
    @Column(name = "last_checksum")
    private Integer lastChecksum;

    /**
     * 
     */
    @Column(name = "last_financial_period_ref_class")
    private String lastFinancialPeriodRefClass;

    /**
     * 
     */
    @Column(name = "last_financial_period_ref_id")
    private Long lastFinancialPeriodRefId;

    /**
     * 
     */
    @Column(name = "last_recalc_date")
    private Date lastRecalcDate;

    /**
     * 
     */
    @Column(name = "last_tasksum_date")
    private Date lastTasksumDate;

    /**
     * 
     */
    @Column(name = "max_qty_per_hour")
    private Double maxQtyPerHour;

    /**
     * 
     */
    @Column(name = "msp_managed_flag")
    private Boolean mspManagedFlag;

    /**
     * 
     */
    @Column(name = "msp_update_actuals_flag")
    private Boolean mspUpdateActualsFlag;

    /**
     * 
     */
    @Column(name = "name_sep_char")
    private String nameSepChar;

    /**
     * 
     */
    @Column(name = "obs_ref_class")
    private String obsRefClass;

    /**
     * 
     */
    @Column(name = "obs_ref_id")
    private Long obsRefId;

    /**
     * 
     */
    @Column(name = "original_project_ref_class")
    private String originalProjectRefClass;

    /**
     * 
     */
    @Column(name = "original_project_ref_id")
    private Long originalProjectRefId;

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
    @Column(name = "plan_end_date")
    private Date planEndDate;

    /**
     * 
     */
    @Column(name = "plan_start_date")
    private Date planStartDate;

    /**
     * 
     */
    @Column(name = "priority_num")
    private Integer priorityNum;

    /**
     * 
     */
    @Column(name = "project_abbreviation")
    private String projectAbbreviation;

    /**
     * 
     */
    @Column(name = "project_flag")
    private Boolean projectFlag;

    /**
     * 
     */
    @Column(name = "project_group_ref_class")
    private String projectGroupRefClass;

    /**
     * 
     */
    @Column(name = "project_group_ref_id")
    private Long projectGroupRefId;

    /**
     * 
     */
    @Column(name = "project_name")
    private String projectName;

    /**
     * 
     */
    @Column(name = "project_short_name")
    private String projectShortName;

    /**
     * 
     */
    @Column(name = "project_template_ref_class")
    private String projectTemplateRefClass;

    /**
     * 
     */
    @Column(name = "project_template_ref_id")
    private Long projectTemplateRefId;

    /**
     * 
     */
    @Column(name = "project_url")
    private String projectUrl;

    /**
     * 
     */
    @Column(name = "remaining_target_link_flag")
    private Boolean remainingTargetLinkFlag;

    /**
     * 
     */
    @Column(name = "reset_planned_flag")
    private Boolean resetPlannedFlag;

    /**
     * 
     */
    @Column(name = "responsible_rsrc_ref_class")
    private String responsibleRsrcRefClass;

    /**
     * 
     */
    @Column(name = "responsible_rsrc_ref_id")
    private Long responsibleRsrcRefId;

    /**
     * 
     */
    @Column(name = "risk_level")
    private Integer riskLevel;

    /**
     * 
     */
    @Column(name = "rsrc_multi_assign_flag")
    private Boolean rsrcMultiAssignFlag;

    /**
     * 
     */
    @Column(name = "rsrc_self_add_flag")
    private Boolean rsrcSelfAddFlag;

    /**
     * 
     */
    @Column(name = "scheduled_end_date")
    private Date scheduledEndDate;

    /**
     * 
     */
    @Column(name = "source_project_ref_class")
    private String sourceProjectRefClass;

    /**
     * 
     */
    @Column(name = "source_project_ref_id")
    private Long sourceProjectRefId;

    /**
     * 
     */
    @Column(name = "start_date")
    private Date startDate;

    /**
     * 
     */
    @Column(name = "at_gate")
    private Boolean atGate;

    /**
     * 
     */
    @Column(name = "lc_state_ref_class")
    private String lcStateRefClass;

    /**
     * 
     */
    @Column(name = "lc_state_ref_id")
    private Long lcStateRefId;

    /**
     * 
     */
    @Column(name = "step_complete_flag")
    private Boolean stepCompleteFlag;

    /**
     * 
     */
    @Column(name = "strgy_priority_num")
    private Integer strgyPriorityNum;

    /**
     * 
     */
    @Column(name = "sum_assign_level")
    private String sumAssignLevel;

    /**
     * 
     */
    @Column(name = "sum_baseline_project_ref_class")
    private String sumBaselineProjectRefClass;

    /**
     * 
     */
    @Column(name = "sum_baseline_project_ref_id")
    private Long sumBaselineProjectRefId;

    /**
     * 
     */
    @Column(name = "sum_data_date")
    private Date sumDataDate;

    /**
     * 
     */
    @Column(name = "sum_only_flag")
    private Boolean sumOnlyFlag;

    /**
     * 
     */
    @Column(name = "task_code_base")
    private Integer taskCodeBase;

    /**
     * 
     */
    @Column(name = "task_code_prefix")
    private String taskCodePrefix;

    /**
     * 
     */
    @Column(name = "task_code_prefix_flag")
    private Boolean taskCodePrefixFlag;

    /**
     * 
     */
    @Column(name = "task_code_step")
    private Integer taskCodeStep;

    /**
     * 
     */
    @Column(name = "timesheet_rsrc_mark_actual_finish_flag")
    private Boolean timesheetRsrcMarkActualFinishFlag;

    /**
     * 
     */
    @Column(name = "timesheet_rsrc_view_compl_asgn_flag")
    private Boolean timesheetRsrcViewComplAsgnFlag;

    /**
     * 
     */
    @Column(name = "timesheet_rsrc_view_inact_actv_flag")
    private Boolean timesheetRsrcViewInactActvFlag;

    /**
     * 
     */
    @Column(name = "use_project_baseline_flag")
    private Boolean useProjectBaselineFlag;

    /**
     * 
     */
    @Column(name = "wbs_max_sum_level")
    private Integer wbsMaxSumLevel;

    /**
     * 
     */
    @Column(name = "lc_template_ref_class")
    private String lcTemplateRefClass;

    /**
     * 
     */
    @Column(name = "lc_template_ref_id")
    private Long lcTemplateRefId;

    /**
     * 
     */
    @Column(name = "project_manager_ref_class")
    private String projectManagerRefClass;

    /**
     * 
     */
    @Column(name = "project_manager_ref_id")
    private Long projectManagerRefId;

    /**
     * 
     */
    @Column(name = "team_reference_class")
    private String teamReferenceClass;

    /**
     * 
     */
    @Column(name = "team_reference_id")
    private Long teamReferenceId;

    /**
     * 
     */
    @Column(name = "team_template_reference_class")
    private String teamTemplateReferenceClass;

    /**
     * 
     */
    @Column(name = "team_template_reference_id")
    private Long teamTemplateReferenceId;

    /**
     * 
     */
    @Column(name = "entry_set")
    private byte[] entrySet;

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
    public Boolean getActualPercentLinkFlag() {
        return actualPercentLinkFlag;
    }

    /**
     * 
     */
    public void setActualPercentLinkFlag(Boolean actualPercentLinkFlag) {
        this.actualPercentLinkFlag = actualPercentLinkFlag;
    }

    /**
     * 
     */
    public Boolean getActualThisPerLinkFlag() {
        return actualThisPerLinkFlag;
    }

    /**
     * 
     */
    public void setActualThisPerLinkFlag(Boolean actualThisPerLinkFlag) {
        this.actualThisPerLinkFlag = actualThisPerLinkFlag;
    }

    /**
     * 
     */
    public Boolean getAddActualRemainFlag() {
        return addActualRemainFlag;
    }

    /**
     * 
     */
    public void setAddActualRemainFlag(Boolean addActualRemainFlag) {
        this.addActualRemainFlag = addActualRemainFlag;
    }

    /**
     * 
     */
    public String getAddByName() {
        return addByName;
    }

    /**
     * 
     */
    public void setAddByName(String addByName) {
        this.addByName = addByName;
    }

    /**
     * 
     */
    public Date getAddDate() {
        return addDate;
    }

    /**
     * 
     */
    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }

    /**
     * 
     */
    public Boolean getAllowCompleteFlag() {
        return allowCompleteFlag;
    }

    /**
     * 
     */
    public void setAllowCompleteFlag(Boolean allowCompleteFlag) {
        this.allowCompleteFlag = allowCompleteFlag;
    }

    /**
     * 
     */
    public Boolean getAllowNegActualFlag() {
        return allowNegActualFlag;
    }

    /**
     * 
     */
    public void setAllowNegActualFlag(Boolean allowNegActualFlag) {
        this.allowNegActualFlag = allowNegActualFlag;
    }

    /**
     * 
     */
    public Date getApplyActualsDate() {
        return applyActualsDate;
    }

    /**
     * 
     */
    public void setApplyActualsDate(Date applyActualsDate) {
        this.applyActualsDate = applyActualsDate;
    }

    /**
     * 
     */
    public String getBaselineTypeRefClass() {
        return baselineTypeRefClass;
    }

    /**
     * 
     */
    public void setBaselineTypeRefClass(String baselineTypeRefClass) {
        this.baselineTypeRefClass = baselineTypeRefClass;
    }

    /**
     * 
     */
    public Long getBaselineTypeRefId() {
        return baselineTypeRefId;
    }

    /**
     * 
     */
    public void setBaselineTypeRefId(Long baselineTypeRefId) {
        this.baselineTypeRefId = baselineTypeRefId;
    }

    /**
     * 
     */
    public Boolean getBatchSumFlag() {
        return batchSumFlag;
    }

    /**
     * 
     */
    public void setBatchSumFlag(Boolean batchSumFlag) {
        this.batchSumFlag = batchSumFlag;
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
    public Date getCheckoutDate() {
        return checkoutDate;
    }

    /**
     * 
     */
    public void setCheckoutDate(Date checkoutDate) {
        this.checkoutDate = checkoutDate;
    }

    /**
     * 
     */
    public Boolean getCheckoutFlag() {
        return checkoutFlag;
    }

    /**
     * 
     */
    public void setCheckoutFlag(Boolean checkoutFlag) {
        this.checkoutFlag = checkoutFlag;
    }

    /**
     * 
     */
    public String getCheckoutUserRefClass() {
        return checkoutUserRefClass;
    }

    /**
     * 
     */
    public void setCheckoutUserRefClass(String checkoutUserRefClass) {
        this.checkoutUserRefClass = checkoutUserRefClass;
    }

    /**
     * 
     */
    public Long getCheckoutUserRefId() {
        return checkoutUserRefId;
    }

    /**
     * 
     */
    public void setCheckoutUserRefId(Long checkoutUserRefId) {
        this.checkoutUserRefId = checkoutUserRefId;
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
    public Boolean getCostQtyRecalcFlag() {
        return costQtyRecalcFlag;
    }

    /**
     * 
     */
    public void setCostQtyRecalcFlag(Boolean costQtyRecalcFlag) {
        this.costQtyRecalcFlag = costQtyRecalcFlag;
    }

    /**
     * 
     */
    public Double getCriticalDurationHourCount() {
        return criticalDurationHourCount;
    }

    /**
     * 
     */
    public void setCriticalDurationHourCount(Double criticalDurationHourCount) {
        this.criticalDurationHourCount = criticalDurationHourCount;
    }

    /**
     * 
     */
    public String getCriticalPathType() {
        return criticalPathType;
    }

    /**
     * 
     */
    public void setCriticalPathType(String criticalPathType) {
        this.criticalPathType = criticalPathType;
    }

    /**
     * 
     */
    public String getDefaultCompletePercentType() {
        return defaultCompletePercentType;
    }

    /**
     * 
     */
    public void setDefaultCompletePercentType(String defaultCompletePercentType) {
        this.defaultCompletePercentType = defaultCompletePercentType;
    }

    /**
     * 
     */
    public Double getDefaultCostPerQty() {
        return defaultCostPerQty;
    }

    /**
     * 
     */
    public void setDefaultCostPerQty(Double defaultCostPerQty) {
        this.defaultCostPerQty = defaultCostPerQty;
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
    public String getDefaultQtyType() {
        return defaultQtyType;
    }

    /**
     * 
     */
    public void setDefaultQtyType(String defaultQtyType) {
        this.defaultQtyType = defaultQtyType;
    }

    /**
     * 
     */
    public String getDefaultRateType() {
        return defaultRateType;
    }

    /**
     * 
     */
    public void setDefaultRateType(String defaultRateType) {
        this.defaultRateType = defaultRateType;
    }

    /**
     * 
     */
    public Boolean getDefaultRollupDatesFlag() {
        return defaultRollupDatesFlag;
    }

    /**
     * 
     */
    public void setDefaultRollupDatesFlag(Boolean defaultRollupDatesFlag) {
        this.defaultRollupDatesFlag = defaultRollupDatesFlag;
    }

    /**
     * 
     */
    public String getDefaultTaskType() {
        return defaultTaskType;
    }

    /**
     * 
     */
    public void setDefaultTaskType(String defaultTaskType) {
        this.defaultTaskType = defaultTaskType;
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
    public Integer getFiscalYearStartMonthNum() {
        return fiscalYearStartMonthNum;
    }

    /**
     * 
     */
    public void setFiscalYearStartMonthNum(Integer fiscalYearStartMonthNum) {
        this.fiscalYearStartMonthNum = fiscalYearStartMonthNum;
    }

    /**
     * 
     */
    public Date getForecastStartDate() {
        return forecastStartDate;
    }

    /**
     * 
     */
    public void setForecastStartDate(Date forecastStartDate) {
        this.forecastStartDate = forecastStartDate;
    }

    /**
     * 
     */
    public String getHistInterval() {
        return histInterval;
    }

    /**
     * 
     */
    public void setHistInterval(String histInterval) {
        this.histInterval = histInterval;
    }

    /**
     * 
     */
    public String getHistLevel() {
        return histLevel;
    }

    /**
     * 
     */
    public void setHistLevel(String histLevel) {
        this.histLevel = histLevel;
    }

    /**
     * 
     */
    public String getIntgProjectType() {
        return intgProjectType;
    }

    /**
     * 
     */
    public void setIntgProjectType(String intgProjectType) {
        this.intgProjectType = intgProjectType;
    }

    /**
     * 
     */
    public Boolean getIsTemplate() {
        return isTemplate;
    }

    /**
     * 
     */
    public void setIsTemplate(Boolean isTemplate) {
        this.isTemplate = isTemplate;
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
    public Date getLastBaselineUpdateDate() {
        return lastBaselineUpdateDate;
    }

    /**
     * 
     */
    public void setLastBaselineUpdateDate(Date lastBaselineUpdateDate) {
        this.lastBaselineUpdateDate = lastBaselineUpdateDate;
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
    public String getLastFinancialPeriodRefClass() {
        return lastFinancialPeriodRefClass;
    }

    /**
     * 
     */
    public void setLastFinancialPeriodRefClass(String lastFinancialPeriodRefClass) {
        this.lastFinancialPeriodRefClass = lastFinancialPeriodRefClass;
    }

    /**
     * 
     */
    public Long getLastFinancialPeriodRefId() {
        return lastFinancialPeriodRefId;
    }

    /**
     * 
     */
    public void setLastFinancialPeriodRefId(Long lastFinancialPeriodRefId) {
        this.lastFinancialPeriodRefId = lastFinancialPeriodRefId;
    }

    /**
     * 
     */
    public Date getLastRecalcDate() {
        return lastRecalcDate;
    }

    /**
     * 
     */
    public void setLastRecalcDate(Date lastRecalcDate) {
        this.lastRecalcDate = lastRecalcDate;
    }

    /**
     * 
     */
    public Date getLastTasksumDate() {
        return lastTasksumDate;
    }

    /**
     * 
     */
    public void setLastTasksumDate(Date lastTasksumDate) {
        this.lastTasksumDate = lastTasksumDate;
    }

    /**
     * 
     */
    public Double getMaxQtyPerHour() {
        return maxQtyPerHour;
    }

    /**
     * 
     */
    public void setMaxQtyPerHour(Double maxQtyPerHour) {
        this.maxQtyPerHour = maxQtyPerHour;
    }

    /**
     * 
     */
    public Boolean getMspManagedFlag() {
        return mspManagedFlag;
    }

    /**
     * 
     */
    public void setMspManagedFlag(Boolean mspManagedFlag) {
        this.mspManagedFlag = mspManagedFlag;
    }

    /**
     * 
     */
    public Boolean getMspUpdateActualsFlag() {
        return mspUpdateActualsFlag;
    }

    /**
     * 
     */
    public void setMspUpdateActualsFlag(Boolean mspUpdateActualsFlag) {
        this.mspUpdateActualsFlag = mspUpdateActualsFlag;
    }

    /**
     * 
     */
    public String getNameSepChar() {
        return nameSepChar;
    }

    /**
     * 
     */
    public void setNameSepChar(String nameSepChar) {
        this.nameSepChar = nameSepChar;
    }

    /**
     * 
     */
    public String getObsRefClass() {
        return obsRefClass;
    }

    /**
     * 
     */
    public void setObsRefClass(String obsRefClass) {
        this.obsRefClass = obsRefClass;
    }

    /**
     * 
     */
    public Long getObsRefId() {
        return obsRefId;
    }

    /**
     * 
     */
    public void setObsRefId(Long obsRefId) {
        this.obsRefId = obsRefId;
    }

    /**
     * 
     */
    public String getOriginalProjectRefClass() {
        return originalProjectRefClass;
    }

    /**
     * 
     */
    public void setOriginalProjectRefClass(String originalProjectRefClass) {
        this.originalProjectRefClass = originalProjectRefClass;
    }

    /**
     * 
     */
    public Long getOriginalProjectRefId() {
        return originalProjectRefId;
    }

    /**
     * 
     */
    public void setOriginalProjectRefId(Long originalProjectRefId) {
        this.originalProjectRefId = originalProjectRefId;
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
    public Date getPlanEndDate() {
        return planEndDate;
    }

    /**
     * 
     */
    public void setPlanEndDate(Date planEndDate) {
        this.planEndDate = planEndDate;
    }

    /**
     * 
     */
    public Date getPlanStartDate() {
        return planStartDate;
    }

    /**
     * 
     */
    public void setPlanStartDate(Date planStartDate) {
        this.planStartDate = planStartDate;
    }

    /**
     * 
     */
    public Integer getPriorityNum() {
        return priorityNum;
    }

    /**
     * 
     */
    public void setPriorityNum(Integer priorityNum) {
        this.priorityNum = priorityNum;
    }

    /**
     * 
     */
    public String getProjectAbbreviation() {
        return projectAbbreviation;
    }

    /**
     * 
     */
    public void setProjectAbbreviation(String projectAbbreviation) {
        this.projectAbbreviation = projectAbbreviation;
    }

    /**
     * 
     */
    public Boolean getProjectFlag() {
        return projectFlag;
    }

    /**
     * 
     */
    public void setProjectFlag(Boolean projectFlag) {
        this.projectFlag = projectFlag;
    }

    /**
     * 
     */
    public String getProjectGroupRefClass() {
        return projectGroupRefClass;
    }

    /**
     * 
     */
    public void setProjectGroupRefClass(String projectGroupRefClass) {
        this.projectGroupRefClass = projectGroupRefClass;
    }

    /**
     * 
     */
    public Long getProjectGroupRefId() {
        return projectGroupRefId;
    }

    /**
     * 
     */
    public void setProjectGroupRefId(Long projectGroupRefId) {
        this.projectGroupRefId = projectGroupRefId;
    }

    /**
     * 
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * 
     */
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    /**
     * 
     */
    public String getProjectShortName() {
        return projectShortName;
    }

    /**
     * 
     */
    public void setProjectShortName(String projectShortName) {
        this.projectShortName = projectShortName;
    }

    /**
     * 
     */
    public String getProjectTemplateRefClass() {
        return projectTemplateRefClass;
    }

    /**
     * 
     */
    public void setProjectTemplateRefClass(String projectTemplateRefClass) {
        this.projectTemplateRefClass = projectTemplateRefClass;
    }

    /**
     * 
     */
    public Long getProjectTemplateRefId() {
        return projectTemplateRefId;
    }

    /**
     * 
     */
    public void setProjectTemplateRefId(Long projectTemplateRefId) {
        this.projectTemplateRefId = projectTemplateRefId;
    }

    /**
     * 
     */
    public String getProjectUrl() {
        return projectUrl;
    }

    /**
     * 
     */
    public void setProjectUrl(String projectUrl) {
        this.projectUrl = projectUrl;
    }

    /**
     * 
     */
    public Boolean getRemainingTargetLinkFlag() {
        return remainingTargetLinkFlag;
    }

    /**
     * 
     */
    public void setRemainingTargetLinkFlag(Boolean remainingTargetLinkFlag) {
        this.remainingTargetLinkFlag = remainingTargetLinkFlag;
    }

    /**
     * 
     */
    public Boolean getResetPlannedFlag() {
        return resetPlannedFlag;
    }

    /**
     * 
     */
    public void setResetPlannedFlag(Boolean resetPlannedFlag) {
        this.resetPlannedFlag = resetPlannedFlag;
    }

    /**
     * 
     */
    public String getResponsibleRsrcRefClass() {
        return responsibleRsrcRefClass;
    }

    /**
     * 
     */
    public void setResponsibleRsrcRefClass(String responsibleRsrcRefClass) {
        this.responsibleRsrcRefClass = responsibleRsrcRefClass;
    }

    /**
     * 
     */
    public Long getResponsibleRsrcRefId() {
        return responsibleRsrcRefId;
    }

    /**
     * 
     */
    public void setResponsibleRsrcRefId(Long responsibleRsrcRefId) {
        this.responsibleRsrcRefId = responsibleRsrcRefId;
    }

    /**
     * 
     */
    public Integer getRiskLevel() {
        return riskLevel;
    }

    /**
     * 
     */
    public void setRiskLevel(Integer riskLevel) {
        this.riskLevel = riskLevel;
    }

    /**
     * 
     */
    public Boolean getRsrcMultiAssignFlag() {
        return rsrcMultiAssignFlag;
    }

    /**
     * 
     */
    public void setRsrcMultiAssignFlag(Boolean rsrcMultiAssignFlag) {
        this.rsrcMultiAssignFlag = rsrcMultiAssignFlag;
    }

    /**
     * 
     */
    public Boolean getRsrcSelfAddFlag() {
        return rsrcSelfAddFlag;
    }

    /**
     * 
     */
    public void setRsrcSelfAddFlag(Boolean rsrcSelfAddFlag) {
        this.rsrcSelfAddFlag = rsrcSelfAddFlag;
    }

    /**
     * 
     */
    public Date getScheduledEndDate() {
        return scheduledEndDate;
    }

    /**
     * 
     */
    public void setScheduledEndDate(Date scheduledEndDate) {
        this.scheduledEndDate = scheduledEndDate;
    }

    /**
     * 
     */
    public String getSourceProjectRefClass() {
        return sourceProjectRefClass;
    }

    /**
     * 
     */
    public void setSourceProjectRefClass(String sourceProjectRefClass) {
        this.sourceProjectRefClass = sourceProjectRefClass;
    }

    /**
     * 
     */
    public Long getSourceProjectRefId() {
        return sourceProjectRefId;
    }

    /**
     * 
     */
    public void setSourceProjectRefId(Long sourceProjectRefId) {
        this.sourceProjectRefId = sourceProjectRefId;
    }

    /**
     * 
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * 
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * 
     */
    public Boolean getAtGate() {
        return atGate;
    }

    /**
     * 
     */
    public void setAtGate(Boolean atGate) {
        this.atGate = atGate;
    }

    /**
     * 
     */
    public String getLcStateRefClass() {
        return lcStateRefClass;
    }

    /**
     * 
     */
    public void setLcStateRefClass(String lcStateRefClass) {
        this.lcStateRefClass = lcStateRefClass;
    }

    /**
     * 
     */
    public Long getLcStateRefId() {
        return lcStateRefId;
    }

    /**
     * 
     */
    public void setLcStateRefId(Long lcStateRefId) {
        this.lcStateRefId = lcStateRefId;
    }

    /**
     * 
     */
    public Boolean getStepCompleteFlag() {
        return stepCompleteFlag;
    }

    /**
     * 
     */
    public void setStepCompleteFlag(Boolean stepCompleteFlag) {
        this.stepCompleteFlag = stepCompleteFlag;
    }

    /**
     * 
     */
    public Integer getStrgyPriorityNum() {
        return strgyPriorityNum;
    }

    /**
     * 
     */
    public void setStrgyPriorityNum(Integer strgyPriorityNum) {
        this.strgyPriorityNum = strgyPriorityNum;
    }

    /**
     * 
     */
    public String getSumAssignLevel() {
        return sumAssignLevel;
    }

    /**
     * 
     */
    public void setSumAssignLevel(String sumAssignLevel) {
        this.sumAssignLevel = sumAssignLevel;
    }

    /**
     * 
     */
    public String getSumBaselineProjectRefClass() {
        return sumBaselineProjectRefClass;
    }

    /**
     * 
     */
    public void setSumBaselineProjectRefClass(String sumBaselineProjectRefClass) {
        this.sumBaselineProjectRefClass = sumBaselineProjectRefClass;
    }

    /**
     * 
     */
    public Long getSumBaselineProjectRefId() {
        return sumBaselineProjectRefId;
    }

    /**
     * 
     */
    public void setSumBaselineProjectRefId(Long sumBaselineProjectRefId) {
        this.sumBaselineProjectRefId = sumBaselineProjectRefId;
    }

    /**
     * 
     */
    public Date getSumDataDate() {
        return sumDataDate;
    }

    /**
     * 
     */
    public void setSumDataDate(Date sumDataDate) {
        this.sumDataDate = sumDataDate;
    }

    /**
     * 
     */
    public Boolean getSumOnlyFlag() {
        return sumOnlyFlag;
    }

    /**
     * 
     */
    public void setSumOnlyFlag(Boolean sumOnlyFlag) {
        this.sumOnlyFlag = sumOnlyFlag;
    }

    /**
     * 
     */
    public Integer getTaskCodeBase() {
        return taskCodeBase;
    }

    /**
     * 
     */
    public void setTaskCodeBase(Integer taskCodeBase) {
        this.taskCodeBase = taskCodeBase;
    }

    /**
     * 
     */
    public String getTaskCodePrefix() {
        return taskCodePrefix;
    }

    /**
     * 
     */
    public void setTaskCodePrefix(String taskCodePrefix) {
        this.taskCodePrefix = taskCodePrefix;
    }

    /**
     * 
     */
    public Boolean getTaskCodePrefixFlag() {
        return taskCodePrefixFlag;
    }

    /**
     * 
     */
    public void setTaskCodePrefixFlag(Boolean taskCodePrefixFlag) {
        this.taskCodePrefixFlag = taskCodePrefixFlag;
    }

    /**
     * 
     */
    public Integer getTaskCodeStep() {
        return taskCodeStep;
    }

    /**
     * 
     */
    public void setTaskCodeStep(Integer taskCodeStep) {
        this.taskCodeStep = taskCodeStep;
    }

    /**
     * 
     */
    public Boolean getTimesheetRsrcMarkActualFinishFlag() {
        return timesheetRsrcMarkActualFinishFlag;
    }

    /**
     * 
     */
    public void setTimesheetRsrcMarkActualFinishFlag(Boolean timesheetRsrcMarkActualFinishFlag) {
        this.timesheetRsrcMarkActualFinishFlag = timesheetRsrcMarkActualFinishFlag;
    }

    /**
     * 
     */
    public Boolean getTimesheetRsrcViewComplAsgnFlag() {
        return timesheetRsrcViewComplAsgnFlag;
    }

    /**
     * 
     */
    public void setTimesheetRsrcViewComplAsgnFlag(Boolean timesheetRsrcViewComplAsgnFlag) {
        this.timesheetRsrcViewComplAsgnFlag = timesheetRsrcViewComplAsgnFlag;
    }

    /**
     * 
     */
    public Boolean getTimesheetRsrcViewInactActvFlag() {
        return timesheetRsrcViewInactActvFlag;
    }

    /**
     * 
     */
    public void setTimesheetRsrcViewInactActvFlag(Boolean timesheetRsrcViewInactActvFlag) {
        this.timesheetRsrcViewInactActvFlag = timesheetRsrcViewInactActvFlag;
    }

    /**
     * 
     */
    public Boolean getUseProjectBaselineFlag() {
        return useProjectBaselineFlag;
    }

    /**
     * 
     */
    public void setUseProjectBaselineFlag(Boolean useProjectBaselineFlag) {
        this.useProjectBaselineFlag = useProjectBaselineFlag;
    }

    /**
     * 
     */
    public Integer getWbsMaxSumLevel() {
        return wbsMaxSumLevel;
    }

    /**
     * 
     */
    public void setWbsMaxSumLevel(Integer wbsMaxSumLevel) {
        this.wbsMaxSumLevel = wbsMaxSumLevel;
    }

    /**
     * 
     */
    public String getLcTemplateRefClass() {
        return lcTemplateRefClass;
    }

    /**
     * 
     */
    public void setLcTemplateRefClass(String lcTemplateRefClass) {
        this.lcTemplateRefClass = lcTemplateRefClass;
    }

    /**
     * 
     */
    public Long getLcTemplateRefId() {
        return lcTemplateRefId;
    }

    /**
     * 
     */
    public void setLcTemplateRefId(Long lcTemplateRefId) {
        this.lcTemplateRefId = lcTemplateRefId;
    }

    /**
     * 
     */
    public String getProjectManagerRefClass() {
        return projectManagerRefClass;
    }

    /**
     * 
     */
    public void setProjectManagerRefClass(String projectManagerRefClass) {
        this.projectManagerRefClass = projectManagerRefClass;
    }

    /**
     * 
     */
    public Long getProjectManagerRefId() {
        return projectManagerRefId;
    }

    /**
     * 
     */
    public void setProjectManagerRefId(Long projectManagerRefId) {
        this.projectManagerRefId = projectManagerRefId;
    }

    /**
     * 
     */
    public String getTeamReferenceClass() {
        return teamReferenceClass;
    }

    /**
     * 
     */
    public void setTeamReferenceClass(String teamReferenceClass) {
        this.teamReferenceClass = teamReferenceClass;
    }

    /**
     * 
     */
    public Long getTeamReferenceId() {
        return teamReferenceId;
    }

    /**
     * 
     */
    public void setTeamReferenceId(Long teamReferenceId) {
        this.teamReferenceId = teamReferenceId;
    }

    /**
     * 
     */
    public String getTeamTemplateReferenceClass() {
        return teamTemplateReferenceClass;
    }

    /**
     * 
     */
    public void setTeamTemplateReferenceClass(String teamTemplateReferenceClass) {
        this.teamTemplateReferenceClass = teamTemplateReferenceClass;
    }

    /**
     * 
     */
    public Long getTeamTemplateReferenceId() {
        return teamTemplateReferenceId;
    }

    /**
     * 
     */
    public void setTeamTemplateReferenceId(Long teamTemplateReferenceId) {
        this.teamTemplateReferenceId = teamTemplateReferenceId;
    }

    /**
     * 
     */
    public byte[] getEntrySet() {
        return entrySet;
    }

    /**
     * 
     */
    public void setEntrySet(byte[] entrySet) {
        this.entrySet = entrySet;
    }
}