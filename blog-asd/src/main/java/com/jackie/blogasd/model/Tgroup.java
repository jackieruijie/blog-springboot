package com.jackie.blogasd.model;

import java.util.Date;

public class Tgroup {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_group.tg_id
     *
     * @mbg.generated Mon Jul 08 09:23:15 CST 2019
     */
    private String tgId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_group.group_name
     *
     * @mbg.generated Mon Jul 08 09:23:15 CST 2019
     */
    private String groupName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_group.parent_tg_id
     *
     * @mbg.generated Mon Jul 08 09:23:15 CST 2019
     */
    private String parentTgId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_group.create_time
     *
     * @mbg.generated Mon Jul 08 09:23:15 CST 2019
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_group.description
     *
     * @mbg.generated Mon Jul 08 09:23:15 CST 2019
     */
    private String description;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_group.tg_id
     *
     * @return the value of t_group.tg_id
     * @mbg.generated Mon Jul 08 09:23:15 CST 2019
     */
    public String getTgId() {
        return tgId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_group.tg_id
     *
     * @param tgId the value for t_group.tg_id
     * @mbg.generated Mon Jul 08 09:23:15 CST 2019
     */
    public void setTgId(String tgId) {
        this.tgId = tgId == null ? null : tgId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_group.group_name
     *
     * @return the value of t_group.group_name
     * @mbg.generated Mon Jul 08 09:23:15 CST 2019
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_group.group_name
     *
     * @param groupName the value for t_group.group_name
     * @mbg.generated Mon Jul 08 09:23:15 CST 2019
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_group.parent_tg_id
     *
     * @return the value of t_group.parent_tg_id
     * @mbg.generated Mon Jul 08 09:23:15 CST 2019
     */
    public String getParentTgId() {
        return parentTgId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_group.parent_tg_id
     *
     * @param parentTgId the value for t_group.parent_tg_id
     * @mbg.generated Mon Jul 08 09:23:15 CST 2019
     */
    public void setParentTgId(String parentTgId) {
        this.parentTgId = parentTgId == null ? null : parentTgId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_group.create_time
     *
     * @return the value of t_group.create_time
     * @mbg.generated Mon Jul 08 09:23:15 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_group.create_time
     *
     * @param createTime the value for t_group.create_time
     * @mbg.generated Mon Jul 08 09:23:15 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_group.description
     *
     * @return the value of t_group.description
     * @mbg.generated Mon Jul 08 09:23:15 CST 2019
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_group.description
     *
     * @param description the value for t_group.description
     * @mbg.generated Mon Jul 08 09:23:15 CST 2019
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}