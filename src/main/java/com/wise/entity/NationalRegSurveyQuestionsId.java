package com.wise.entity;

import java.io.Serializable;

public class NationalRegSurveyQuestionsId implements Serializable {

    private int questionId;
    private int surveyId;

    public NationalRegSurveyQuestionsId() {
    }

    public NationalRegSurveyQuestionsId(int questionId, int surveyId) {
        this.questionId = questionId;
        this.surveyId = surveyId;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public int getSurveyId() {
        return surveyId;
    }

    public void setSurveyId(int surveyId) {
        this.surveyId = surveyId;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
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
