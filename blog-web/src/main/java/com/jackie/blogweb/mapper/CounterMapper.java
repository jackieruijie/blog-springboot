package com.jackie.blogweb.mapper;

import com.jackie.blogweb.model.Counter;

public interface CounterMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table counter
     *
     * @mbg.generated Thu Jun 20 10:19:06 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table counter
     *
     * @mbg.generated Thu Jun 20 10:19:06 CST 2019
     */
    int insert(Counter record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table counter
     *
     * @mbg.generated Thu Jun 20 10:19:06 CST 2019
     */
    int insertSelective(Counter record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table counter
     *
     * @mbg.generated Thu Jun 20 10:19:06 CST 2019
     */
    Counter selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table counter
     *
     * @mbg.generated Thu Jun 20 10:19:06 CST 2019
     */
    int updateByPrimaryKeySelective(Counter record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table counter
     *
     * @mbg.generated Thu Jun 20 10:19:06 CST 2019
     */
    int updateByPrimaryKey(Counter record);

    public int updateWebViews();


}