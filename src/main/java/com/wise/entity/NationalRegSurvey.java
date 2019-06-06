package com.wise.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@IdClass(NationalRegSurveyId.class)
@Table(name = "national_reg_survey")
public class NationalRegSurvey {

    @Id
    @Column(name = "personid")
    private int personId;

    @Id
    @Column(name = "surveyid")
    private int surveyId;

    @Id
    @Column(name = "questionId")
    private int questionId;

    @Id
    @Column(name = "surveydate")
    private Date surveyDate;

    @Column(name = "questionanswer")
    private String questionAnswer;

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public int getSurveyId() {
        return surveyId;
    }

    public void setSurveyId(int surveyId) {
        this.surveyId = surveyId;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public Date getSurveyDate() {
        return surveyDate;
    }

    public void setSurveyDate(Date surveyDate) {
        this.surveyDate = surveyDate;
    }

    public String getQuestionAnswer() {
        return questionAnswer;
    }

    public void setQuestionAnswer(String questionAnswer) {
        this.questionAnswer = questionAnswer;
    }
}
