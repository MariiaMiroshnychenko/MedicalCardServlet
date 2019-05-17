package model.services;

import model.entity.Doctor;
import model.entity.Patient;
import model.entity.Visit;

import java.util.List;

public class MedicalCard {//implements EntityDao<Visit> {
    private Patient patient;
    private Doctor doctor;
    private List<Visit> visits;

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
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
