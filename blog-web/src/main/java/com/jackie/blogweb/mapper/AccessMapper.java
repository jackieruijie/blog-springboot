package com.jackie.blogweb.mapper;

import com.jackie.blogweb.model.Access;
import org.springframework.stereotype.Repository;

@Repository
public interface AccessMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table access
     *
     * @mbg.generated Thu Jun 20 10:19:06 CST 2019
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table access
     *
     * @mbg.generated Thu Jun 20 10:19:06 CST 2019
     */
    int insert(Access record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table access
     *
     * @mbg.generated Thu Jun 20 10:19:06 CST 2019
     */
    int insertSelective(Access record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table access
     *
     * @mbg.generated Thu Jun 20 10:19:06 CST 2019
     */
    Access selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table access
     *
     * @mbg.generated Thu Jun 20 10:19:06 CST 2019
     */
    int updateByPrimaryKeySelective(Access record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table access
     *
     * @mbg.generated Thu Jun 20 10:19:06 CST 2019
     */
    int updateByPrimaryKey(Access record);
}