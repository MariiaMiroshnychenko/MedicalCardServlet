package model.services;

import model.entity.Doctor;
import model.entity.Patient;

import java.util.List;

public interface DoctorCreator {
    Doctor createDoctor(List<Doctor> doctors, Patient patient);
}
