package com.jackie.blogasd.model;

import java.util.Date;

public class Torganization {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_organization.to_id
     *
     * @mbg.generated Mon Jul 08 09:23:15 CST 2019
     */
    private String toId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_organization.parent_to_id
     *
     * @mbg.generated Mon Jul 08 09:23:15 CST 2019
     */
    private String parentToId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_organization.org_name
     *
     * @mbg.generated Mon Jul 08 09:23:15 CST 2019
     */
    private String orgName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_organization.create_time
     *
     * @mbg.generated Mon Jul 08 09:23:15 CST 2019
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_organization.description
     *
     * @mbg.generated Mon Jul 08 09:23:15 CST 2019
     */
    private String description;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_organization.to_id
     *
     * @return the value of t_organization.to_id
     * @mbg.generated Mon Jul 08 09:23:15 CST 2019
     */
    public String getToId() {
        return toId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_organization.to_id
     *
     * @param toId the value for t_organization.to_id
     * @mbg.generated Mon Jul 08 09:23:15 CST 2019
     */
    public void setToId(String toId) {
        this.toId = toId == null ? null : toId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_organization.parent_to_id
     *
     * @return the value of t_organization.parent_to_id
     * @mbg.generated Mon Jul 08 09:23:15 CST 2019
     */
    public String getParentToId() {
        return parentToId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_organization.parent_to_id
     *
     * @param parentToId the value for t_organization.parent_to_id
     * @mbg.generated Mon Jul 08 09:23:15 CST 2019
     */
    public void setParentToId(String parentToId) {
        this.parentToId = parentToId == null ? null : parentToId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_organization.org_name
     *
     * @return the value of t_organization.org_name
     * @mbg.generated Mon Jul 08 09:23:15 CST 2019
     */
    public String getOrgName() {
        return orgName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_organization.org_name
     *
     * @param orgName the value for t_organization.org_name
     * @mbg.generated Mon Jul 08 09:23:15 CST 2019
     */
    public void setOrgName(String orgName) {
        this.orgName = orgName == null ? null : orgName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_organization.create_time
     *
     * @return the value of t_organization.create_time
     * @mbg.generated Mon Jul 08 09:23:15 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_organization.create_time
     *
     * @param createTime the value for t_organization.create_time
     * @mbg.generated Mon Jul 08 09:23:15 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_organization.description
     *
     * @return the value of t_organization.description
     * @mbg.generated Mon Jul 08 09:23:15 CST 2019
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_organization.description
     *
     * @param description the value for t_organization.description
     * @mbg.generated Mon Jul 08 09:23:15 CST 2019
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}