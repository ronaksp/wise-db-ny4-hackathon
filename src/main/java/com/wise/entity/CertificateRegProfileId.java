package com.wise.entity;

import java.io.Serializable;
import java.util.Objects;

public class CertificateRegProfileId implements Serializable {

    private String institutionName;
    private String institutionState;
    private String studentId;

    public CertificateRegProfileId() {
    }

    public CertificateRegProfileId(String institutionName, String institutionState, String studentId) {
        this.institutionName = institutionName;
        this.institutionState = institutionState;
        this.studentId = studentId;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CertificateRegProfileId that = (CertificateRegProfileId) o;
        return Objects.equals(institutionName, that.institutionName) &&
                Objects.equals(institutionState, that.institutionState) &&
                Objects.equals(studentId, that.studentId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(institutionName, institutionState, studentId);
    }
}
