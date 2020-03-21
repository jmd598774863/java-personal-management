package jmd.po;

import java.util.Date;

public class Task {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task.task_type_id
     *
     * @mbg.generated
     */
    private Integer taskTypeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task.project
     *
     * @mbg.generated
     */
    private String project;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task.code
     *
     * @mbg.generated
     */
    private String code;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task.task_short_name
     *
     * @mbg.generated
     */
    private String taskShortName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task.task_name
     *
     * @mbg.generated
     */
    private String taskName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task.status
     *
     * @mbg.generated
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task.start_date
     *
     * @mbg.generated
     */
    private Date startDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task.cut_off_date
     *
     * @mbg.generated
     */
    private Date cutOffDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task.priority
     *
     * @mbg.generated
     */
    private Integer priority;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task.important
     *
     * @mbg.generated
     */
    private String important;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task.user_id
     *
     * @mbg.generated
     */
    private String userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task.hold_time
     *
     * @mbg.generated
     */
    private Long holdTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task.field_2
     *
     * @mbg.generated
     */
    private String field2;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task.field_3
     *
     * @mbg.generated
     */
    private String field3;

    public Task(){}
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task
     *
     * @mbg.generated
     */
    public Task(Integer id, Integer taskTypeId, String project, String code, String taskShortName, String taskName, Integer status, Date startDate, Date cutOffDate, Integer priority, String important, String userId, Long holdTime, String field2, String field3) {
        this.id = id;
        this.taskTypeId = taskTypeId;
        this.project = project;
        this.code = code;
        this.taskShortName = taskShortName;
        this.taskName = taskName;
        this.status = status;
        this.startDate = startDate;
        this.cutOffDate = cutOffDate;
        this.priority = priority;
        this.important = important;
        this.userId = userId;
        this.holdTime = holdTime;
        this.field2 = field2;
        this.field3 = field3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task.id
     *
     * @return the value of task.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task.task_type_id
     *
     * @return the value of task.task_type_id
     *
     * @mbg.generated
     */
    public Integer getTaskTypeId() {
        return taskTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task.project
     *
     * @return the value of task.project
     *
     * @mbg.generated
     */
    public String getProject() {
        return project;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task.code
     *
     * @return the value of task.code
     *
     * @mbg.generated
     */
    public String getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task.task_short_name
     *
     * @return the value of task.task_short_name
     *
     * @mbg.generated
     */
    public String getTaskShortName() {
        return taskShortName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task.task_name
     *
     * @return the value of task.task_name
     *
     * @mbg.generated
     */
    public String getTaskName() {
        return taskName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task.status
     *
     * @return the value of task.status
     *
     * @mbg.generated
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task.start_date
     *
     * @return the value of task.start_date
     *
     * @mbg.generated
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task.cut_off_date
     *
     * @return the value of task.cut_off_date
     *
     * @mbg.generated
     */
    public Date getCutOffDate() {
        return cutOffDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task.priority
     *
     * @return the value of task.priority
     *
     * @mbg.generated
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task.important
     *
     * @return the value of task.important
     *
     * @mbg.generated
     */
    public String getImportant() {
        return important;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task.user_id
     *
     * @return the value of task.user_id
     *
     * @mbg.generated
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task.hold_time
     *
     * @return the value of task.hold_time
     *
     * @mbg.generated
     */
    public Long getHoldTime() {
        return holdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task.field_2
     *
     * @return the value of task.field_2
     *
     * @mbg.generated
     */
    public String getField2() {
        return field2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task.field_3
     *
     * @return the value of task.field_3
     *
     * @mbg.generated
     */
    public String getField3() {
        return field3;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTaskTypeId(Integer taskTypeId) {
        this.taskTypeId = taskTypeId;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setTaskShortName(String taskShortName) {
        this.taskShortName = taskShortName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setCutOffDate(Date cutOffDate) {
        this.cutOffDate = cutOffDate;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public void setImportant(String important) {
        this.important = important;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setHoldTime(Long holdTime) {
        this.holdTime = holdTime;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }

    public void setField3(String field3) {
        this.field3 = field3;
    }
}