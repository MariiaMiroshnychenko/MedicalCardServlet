package model.entity;

import java.sql.Date;

public class Visit {
    private int visitId;
    private Date visitDate;
    private int medicalCardId;
    private String diagnosis;

    private Patient patient;

    public Visit(int visitId, Date visitDate, int medicalCardId, String diagnosis, Patient patient) {
        this.visitId = visitId;
        this.visitDate = visitDate;
        this.medicalCardId = medicalCardId;
        this.diagnosis = diagnosis;
        this.patient = patient;
    }

    public Visit() {
    }

    public int getVisitId() {
        return visitId;
    }

    public void setVisitId(int visitId) {
        this.visitId = visitId;
    }

    public Date getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(Date visitDate) {
        this.visitDate = visitDate;
    }

    public int getMedicalCardId() {
        return medicalCardId;
    }

    public void setMedicalCardId(int medicalCardId) {
        this.medicalCardId = medicalCardId;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
}

