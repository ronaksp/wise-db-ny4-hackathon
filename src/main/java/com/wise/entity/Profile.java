package com.wise.entity;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "flc_reg_profile")
public class Profile {

    @Column(name = "FirstName")
    private String firstName;
    @Column(name = "LastName")
    private String lastName;
    @Column(name = "DateOfBirth")
    private Date dateOfBirth;
    @Id
    @Column(name = "StudentId")
    private String studentId;
    @Column(name = "HighSchoolName")
    private String highSchoolName;
    @Column(name = "YearOfFLCPassed")
    private int yearOfFLCPassed;
    @Column(name = "CertificateNumber")
    private int certificateNumber;


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

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getHighSchoolName() {
        return highSchoolName;
    }

    public void setHighSchoolName(String highSchoolName) {
        this.highSchoolName = highSchoolName;
    }

    public int getYearOfFLCPassed() {
        return yearOfFLCPassed;
    }

    public void setYearOfFLCPassed(int yearOfFLCPassed) {
        this.yearOfFLCPassed = yearOfFLCPassed;
    }

    public int getCertificateNumber() {
        return certificateNumber;
    }

    public void setCertificateNumber(int certificateNumber) {
        this.certificateNumber = certificateNumber;
    }
}
