package model.entity;

import java.util.ArrayList;
import java.util.List;

public class Patient {
    private int patientId;
    private String surname;
    private String firstName;
    private String secondName;
    private int medicalCardId;

    private List<Visit> visits = new ArrayList<>();

    public Patient(int patientId, String surname, String firstName, String secondName, int medicalCardId) {
        this.patientId = patientId;
        this.surname = surname;
        this.firstName = firstName;
        this.secondName = secondName;
        this.medicalCardId = medicalCardId;
    }

    public Patient(int patientId, String surname, String firstName, String secondName, int medicalCardId, List<Visit> visits) {
        this.patientId = patientId;
        this.surname = surname;
        this.firstName = firstName;
        this.secondName = secondName;
        this.medicalCardId = medicalCardId;
        this.visits = visits;
    }

    public Patient() {
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getMedicalCardId() {
        return medicalCardId;
    }

    public void setMedicalCardId(int medicalCardId) {
        this.medicalCardId = medicalCardId;
    }

    public List<Visit> getVisits() {
        return visits;
    }

    public void setVisits(List<Visit> visits) {
        this.visits = visits;
    }
}

