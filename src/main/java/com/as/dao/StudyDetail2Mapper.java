package com.as.dao;

import com.as.dataobject.StudyDetail2;

public interface StudyDetail2Mapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table studyscoredetail2
     *
     * @mbg.generated Mon Apr 20 13:35:31 CST 2020
     */
    int deleteByPrimaryKey(String sid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table studyscoredetail2
     *
     * @mbg.generated Mon Apr 20 13:35:31 CST 2020
     */
    int insert(StudyDetail2 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table studyscoredetail2
     *
     * @mbg.generated Mon Apr 20 13:35:31 CST 2020
     */
    int insertSelective(StudyDetail2 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table studyscoredetail2
     *
     * @mbg.generated Mon Apr 20 13:35:31 CST 2020
     */
    StudyDetail2 selectByPrimaryKey(String sid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table studyscoredetail2
     *
     * @mbg.generated Mon Apr 20 13:35:31 CST 2020
     */
    int updateByPrimaryKeySelective(StudyDetail2 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table studyscoredetail2
     *
     * @mbg.generated Mon Apr 20 13:35:31 CST 2020
     */
    int updateByPrimaryKey(StudyDetail2 record);
}