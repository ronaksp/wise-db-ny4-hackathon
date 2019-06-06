package com.wise.entity;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "certificate_reg_profile")
@IdClass(CertificateRegProfileId.class)
public class CertificateRegProfile {

    @Id
    @Column(name = "instritutionname")
    private String institutionName;
    @Id
    @Column(name = "instritutionstate")
    private String institutionState;
    @Id
    @Column(name = "studentid")
    private String studentId;
    @Column(name = "firstname")
    private String firstName;
    @Column(name = "lastname")
    private String lastName;
    @Column(name = "grade")
    private int grade;
    @Column(name = "birthdate")
    private Date birthDate;
    @Column(name = "gender")
    private String gender;
    @Column(name = "testdate")
    private Date testDate;
    @Column(name="resultid")
    private int resultId;
    @Column(name = "passfail")
    private String passFail;
    @Column(name = "score")
    private int score;
    @Column(name = "certificatenumber")
    private int certificateNumber;

    public String getInstitutionName() {
        return institutionName;
    }

    public void setInstitutionName(String institutionName) {
        this.institutionName = institutionName;
    }

    public String getInstitutionState() {
        return institutionState;
    }

    public void setInstitutionState(String institutionState) {
        this.institutionState = institutionState;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getTestDate() {
        return testDate;
    }

    public void setTestDate(Date testDate) {
        this.testDate = testDate;
    }

    public int getResultId() {
        return resultId;
    }

    public void setResultId(int resultId) {
        this.resultId = resultId;
    }

    public String getPassFail() {
        return passFail;
    }

    public void setPassFail(String passFail) {
        this.passFail = passFail;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getCertificateNumber() {
        return certificateNumber;
    }

    public void setCertificateNumber(int certificateNumber) {
        this.certificateNumber = certificateNumber;
    }

    @Override
    public String toString() {
        return "CertificateRegProfile{" +
                "institutionName='" + institutionName + '\'' +
                ", institutionState='" + institutionState + '\'' +
                ", studentId='" + studentId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", grade=" + grade +
                ", birthDate='" + birthDate + '\'' +
                ", gender='" + gender + '\'' +
                ", testDate='" + testDate + '\'' +
                ", resultId=" + resultId +
                ", passFail='" + passFail + '\'' +
                ", score=" + score +
                ", certificateNumber=" + certificateNumber +
                '}';
    }
}
