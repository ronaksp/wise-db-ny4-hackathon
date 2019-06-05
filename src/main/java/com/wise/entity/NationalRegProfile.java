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
    @Column(name = "PersonId")
    private int personId;
    @Column(name = "FirstName")
    private String firstName;
    @Column(name = "LastName")
    private String lastName;
    @Column(name = "DateOfBirth")
    private Date dateOfBirth;
    @Column(name = "EmailId")
    private String emailId;
    @Column(name = "PhoneNumber")
    private String phoneNumber;
    @Column(name = "Address")
    private String address;
    @Column(name = "StudentId")
    private String studentId;
    @Column(name = "HighschoolName")
    private String highschoolName;
    @Column(name = "YearOfFLCPassed")
    private int yearOfFLCPassed;
    @Column(name = "HighestLevelOfEducation")
    private String highestLevelOfEducation;
    @Column(name = "CollegeName")
    private String collegeName;
    @Column(name = "YearOfGraduation")
    private int yearOfGraduation;
    @Column(name = "CurrentJobOrg")
    private String currentJobOrg;
    @Column(name = "CurrentJobTitle")
    private String currentJobTitle;
    @Column(name = "Gender")
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
