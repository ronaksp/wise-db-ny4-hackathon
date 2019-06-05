package com.wise.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@IdClass(NationalRegSurveyQuestionsId.class)
@Table(name = "national_reg_surveyquestions")
public class NationalRegSurveyQuestions {

    @Id
    @Column(name = "SurveyId")
    private int surveyId;
    @Column(name = "CreatedOn")
    private Date createdOn;
    @Column(name = "UpdatedOn")
    private Date updatedOn;
    @Column(name = "UpdatedBy")
    private String updatedBy;
    @Id
    @Column(name = "QuestionId")
    private int questionId;
    @Column(name = "QuestionDetails")
    private String questionDetails;
    @Column(name = "QuestionAnswerOptions")
    private String questionAnswerOptions;
    @Column(name = "QuestionType")
    private int questionType;

    public int getSurveyId() {
        return surveyId;
    }

    public void setSurveyId(int surveyId) {
        this.surveyId = surveyId;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public Date getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getQuestionDetails() {
        return questionDetails;
    }

    public void setQuestionDetails(String questionDetails) {
        this.questionDetails = questionDetails;
    }

    public String getQuestionAnswerOptions() {
        return questionAnswerOptions;
    }

    public void setQuestionAnswerOptions(String questionAnswerOptions) {
        this.questionAnswerOptions = questionAnswerOptions;
    }

    public int getQuestionType() {
        return questionType;
    }

    public void setQuestionType(int questionType) {
        this.questionType = questionType;
    }
}
