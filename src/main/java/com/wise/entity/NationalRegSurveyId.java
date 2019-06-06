package com.wise.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class NationalRegSurveyId implements Serializable {

    private int personId;
    private int surveyId;
    private int questionId;
    private Date surveyDate;

    public NationalRegSurveyId() {
    }

    public NationalRegSurveyId(int personId, int surveyId, int questionId, Date surveyDate) {
        this.personId = personId;
        this.surveyId = surveyId;
        this.questionId = questionId;
        this.surveyDate = surveyDate;
    }

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

    @Override
    public int hashCode() {
        return Objects.hash(personId, surveyId, questionId, surveyDate);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
