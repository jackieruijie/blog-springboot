package com.jackie.blogweb.model;

public class Counter {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column counter.id
     *
     * @mbg.generated Thu Jun 20 10:19:06 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column counter.num
     *
     * @mbg.generated Thu Jun 20 10:19:06 CST 2019
     */
    private Long num;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column counter.id
     *
     * @return the value of counter.id
     *
     * @mbg.generated Thu Jun 20 10:19:06 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column counter.id
     *
     * @param id the value for counter.id
     *
     * @mbg.generated Thu Jun 20 10:19:06 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column counter.num
     *
     * @return the value of counter.num
     *
     * @mbg.generated Thu Jun 20 10:19:06 CST 2019
     */
    public Long getNum() {
        return num;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column counter.num
     *
     * @param num the value for counter.num
     *
     * @mbg.generated Thu Jun 20 10:19:06 CST 2019
     */
    public void setNum(Long num) {
        this.num = num;
    }
}