package com.as.dao;

import com.as.dataobject.Questionnaire;

import java.util.List;

public interface QuestionnaireMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table questionnaire
     *
     * @mbg.generated Tue Apr 21 16:57:31 CST 2020
     * @param qid
     */
    int deleteByPrimaryKey(int qid);
    List<Questionnaire> getAllQuestionnaire();
     /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table questionnaire
     *
     * @mbg.generated Tue Apr 21 16:57:31 CST 2020
     */
    int insert(Questionnaire record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table questionnaire
     *
     * @mbg.generated Tue Apr 21 16:57:31 CST 2020
     */
    int insertSelective(Questionnaire record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table questionnaire
     *
     * @mbg.generated Tue Apr 21 16:57:31 CST 2020
     */
    Questionnaire selectByPrimaryKey(Integer qid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table questionnaire
     *
     * @mbg.generated Tue Apr 21 16:57:31 CST 2020
     */
    int updateByPrimaryKeySelective(Questionnaire record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table questionnaire
     *
     * @mbg.generated Tue Apr 21 16:57:31 CST 2020
     */
    int updateByPrimaryKey(Questionnaire record);
}