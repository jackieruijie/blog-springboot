package com.jackie.blogweb.model;

import java.util.Date;

public class Access {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column access.ID
     *
     * @mbg.generated Thu Jun 20 10:19:06 CST 2019
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column access.IPADDR
     *
     * @mbg.generated Thu Jun 20 10:19:06 CST 2019
     */
    private String ipaddr;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column access.ADDR
     *
     * @mbg.generated Thu Jun 20 10:19:06 CST 2019
     */
    private String addr;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column access.VIEW_TIME
     *
     * @mbg.generated Thu Jun 20 10:19:06 CST 2019
     */
    private Date viewTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column access.ID
     *
     * @return the value of access.ID
     *
     * @mbg.generated Thu Jun 20 10:19:06 CST 2019
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column access.ID
     *
     * @param id the value for access.ID
     *
     * @mbg.generated Thu Jun 20 10:19:06 CST 2019
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column access.IPADDR
     *
     * @return the value of access.IPADDR
     *
     * @mbg.generated Thu Jun 20 10:19:06 CST 2019
     */
    public String getIpaddr() {
        return ipaddr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column access.IPADDR
     *
     * @param ipaddr the value for access.IPADDR
     *
     * @mbg.generated Thu Jun 20 10:19:06 CST 2019
     */
    public void setIpaddr(String ipaddr) {
        this.ipaddr = ipaddr == null ? null : ipaddr.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column access.ADDR
     *
     * @return the value of access.ADDR
     *
     * @mbg.generated Thu Jun 20 10:19:06 CST 2019
     */
    public String getAddr() {
        return addr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column access.ADDR
     *
     * @param addr the value for access.ADDR
     *
     * @mbg.generated Thu Jun 20 10:19:06 CST 2019
     */
    public void setAddr(String addr) {
        this.addr = addr == null ? null : addr.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column access.VIEW_TIME
     *
     * @return the value of access.VIEW_TIME
     *
     * @mbg.generated Thu Jun 20 10:19:06 CST 2019
     */
    public Date getViewTime() {
        return viewTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column access.VIEW_TIME
     *
     * @param viewTime the value for access.VIEW_TIME
     *
     * @mbg.generated Thu Jun 20 10:19:06 CST 2019
     */
    public void setViewTime(Date viewTime) {
        this.viewTime = viewTime;
    }

    @Override
    public String toString() {
        return "Access{" +
                "id='" + id + '\'' +
                ", ipaddr='" + ipaddr + '\'' +
                ", addr='" + addr + '\'' +
                ", viewTime=" + viewTime +
                '}';
    }
}