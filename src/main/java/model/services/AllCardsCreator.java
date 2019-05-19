package model.services;

import model.entity.Doctor;
import model.entity.Patient;
import model.entity.Visit;

import java.util.List;

public interface AllCardsCreator extends DoctorCreator, VisitsCreator {
    @Override
    Doctor createDoctor(List<Doctor> doctors, Patient patient);

    @Override
    List<Visit> createVisit(List<Visit> visits, Patient patient);
}
