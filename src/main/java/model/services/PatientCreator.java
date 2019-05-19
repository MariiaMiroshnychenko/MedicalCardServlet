package model.services;

import model.entity.Doctor;
import model.entity.Patient;

import java.util.List;

public interface PatientCreator {
    Patient createPatient(List<Patient> patients, Patient patient);
}
