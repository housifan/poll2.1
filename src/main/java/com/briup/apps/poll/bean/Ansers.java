package com.briup.apps.poll.bean;

public class Ansers {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column poll_answers.id
     *
     * @mbg.generated Mon Jun 25 17:33:20 CST 2018
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column poll_answers.selection
     *
     * @mbg.generated Mon Jun 25 17:33:20 CST 2018
     */
    private String selection;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column poll_answers.check
     *
     * @mbg.generated Mon Jun 25 17:33:20 CST 2018
     */
    private String check;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column poll_answers.survey_id
     *
     * @mbg.generated Mon Jun 25 17:33:20 CST 2018
     */
    private Long surveyId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column poll_answers.content
     *
     * @mbg.generated Mon Jun 25 17:33:20 CST 2018
     */
    private String content;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column poll_answers.id
     *
     * @return the value of poll_answers.id
     *
     * @mbg.generated Mon Jun 25 17:33:20 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column poll_answers.id
     *
     * @param id the value for poll_answers.id
     *
     * @mbg.generated Mon Jun 25 17:33:20 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column poll_answers.selection
     *
     * @return the value of poll_answers.selection
     *
     * @mbg.generated Mon Jun 25 17:33:20 CST 2018
     */
    public String getSelection() {
        return selection;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column poll_answers.selection
     *
     * @param selection the value for poll_answers.selection
     *
     * @mbg.generated Mon Jun 25 17:33:20 CST 2018
     */
    public void setSelection(String selection) {
        this.selection = selection == null ? null : selection.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column poll_answers.check
     *
     * @return the value of poll_answers.check
     *
     * @mbg.generated Mon Jun 25 17:33:20 CST 2018
     */
    public String getCheck() {
        return check;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column poll_answers.check
     *
     * @param check the value for poll_answers.check
     *
     * @mbg.generated Mon Jun 25 17:33:20 CST 2018
     */
    public void setCheck(String check) {
        this.check = check == null ? null : check.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column poll_answers.survey_id
     *
     * @return the value of poll_answers.survey_id
     *
     * @mbg.generated Mon Jun 25 17:33:20 CST 2018
     */
    public Long getSurveyId() {
        return surveyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column poll_answers.survey_id
     *
     * @param surveyId the value for poll_answers.survey_id
     *
     * @mbg.generated Mon Jun 25 17:33:20 CST 2018
     */
    public void setSurveyId(Long surveyId) {
        this.surveyId = surveyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column poll_answers.content
     *
     * @return the value of poll_answers.content
     *
     * @mbg.generated Mon Jun 25 17:33:20 CST 2018
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column poll_answers.content
     *
     * @param content the value for poll_answers.content
     *
     * @mbg.generated Mon Jun 25 17:33:20 CST 2018
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}