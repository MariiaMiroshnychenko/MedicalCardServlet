package model.entity;

import java.util.ArrayList;
import java.util.List;

public class Patient {
    private int patientId;
    private String surname;
    private String firstName;
    private String secondName;
    private int medCardId;
    private int doctorId;

    private Doctor doctor;
    private List<Visit> visits = new ArrayList<>();

    public Patient(int patientId, String surname, String firstName, String secondName, int medCardId, int doctorId, Doctor doctor, List<Visit> visits) {
        this.patientId = patientId;
        this.surname = surname;
        this.firstName = firstName;
        this.secondName = secondName;
        this.medCardId = medCardId;
        this.doctorId = doctorId;
        this.doctor = doctor;
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

    public int getMedCardId() {
        return medCardId;
    }

    public void setMedCardId(int medCardId) {
        this.medCardId = medCardId;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public List<Visit> getVisits() {
        return visits;
    }

    public void setVisits(List<Visit> visits) {
        this.visits = visits;
    }
}

