package model.entity;

import java.util.List;

public class PatientDoctorLink{
    private int patientId;
    private int doctorId;

    private List<Patient> patients;

    public PatientDoctorLink(int patientId, int doctorId) {
        this.patientId = patientId;
        this.doctorId = doctorId;
    }

    public PatientDoctorLink(int patientId, int doctorId, List<Patient> patients) {
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.patients = patients;
    }

    public PatientDoctorLink() {
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }
}

