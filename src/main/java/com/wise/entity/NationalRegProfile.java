package com.wise.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "national_reg_profile")
public class NationalRegProfile {

    @Id
    @Column(name = "personid")
    private int personId;
    @Column(name = "firstname")
    private String firstName;
    @Column(name = "lastname")
    private String lastName;
    @Column(name = "dateofbirth")
    private Date dateOfBirth;
    @Column(name = "emailid")
    private String emailId;
    @Column(name = "phonenumber")
    private String phoneNumber;
    @Column(name = "address")
    private String address;
    @Column(name = "studentid")
    private String studentId;
    @Column(name = "highschoolname")
    private String highschoolName;
    @Column(name = "yearofflcpassed")
    private int yearOfFLCPassed;
    @Column(name = "highestlevelofeducation")
    private String highestLevelOfEducation;
    @Column(name = "collegename")
    private String collegeName;
    @Column(name = "yearofgraduation")
    private int yearOfGraduation;
    @Column(name = "Currentjoborg")
    private String currentJobOrg;
    @Column(name = "currentjobtitle")
    private String currentJobTitle;
    @Column(name = "gender")
    private String gender;

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
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

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getHighschoolName() {
        return highschoolName;
    }

    public void setHighschoolName(String highschoolName) {
        this.highschoolName = highschoolName;
    }

    public int getYearOfFLCPassed() {
        return yearOfFLCPassed;
    }

    public void setYearOfFLCPassed(int yearOfFLCPassed) {
        this.yearOfFLCPassed = yearOfFLCPassed;
    }

    public String getHighestLevelOfEducation() {
        return highestLevelOfEducation;
    }

    public void setHighestLevelOfEducation(String highestLevelOfEducation) {
        this.highestLevelOfEducation = highestLevelOfEducation;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public int getYearOfGraduation() {
        return yearOfGraduation;
    }

    public void setYearOfGraduation(int yearOfGraduation) {
        this.yearOfGraduation = yearOfGraduation;
    }

    public String getCurrentJobOrg() {
        return currentJobOrg;
    }

    public void setCurrentJobOrg(String currentJobOrg) {
        this.currentJobOrg = currentJobOrg;
    }

    public String getCurrentJobTitle() {
        return currentJobTitle;
    }

    public void setCurrentJobTitle(String currentJobTitle) {
        this.currentJobTitle = currentJobTitle;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
