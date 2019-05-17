package model.services;

import model.entity.Doctor;
import model.entity.Patient;
import model.entity.Visit;
import model.jdbc.JdbcFactoryDao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class CreateMedicalCard {

    public List<MedicalCard> create() {
        List<MedicalCard> medicalCards = new ArrayList<>();

        List<Patient> patients = new JdbcFactoryDao().getPatientJdbcDao().getAll();
        List<Doctor> doctors = new JdbcFactoryDao().getDoctorJdbcDao().getAll();
        List<Visit> visits = new JdbcFactoryDao().getVisitJdbcDao().getAll();

        Iterator iterator = patients.iterator();

        while (iterator.hasNext()) {
            MedicalCard medicalCard = new MedicalCard();

            medicalCard.setPatient((Patient) iterator.next());
            medicalCard.setDoctor(getPatientDoctor(doctors, medicalCard.getPatient()));
            medicalCard.setVisits(getPatientVisit(visits, medicalCard.getPatient()));

            medicalCards.add(medicalCard);
        }
        return medicalCards;
    }

    public Doctor getPatientDoctor(List<Doctor> doctors, Patient patient) {
        return doctors.stream().filter(d -> d.getDoctorId() == patient.getDoctorId()).findFirst().get();
    }

    public List<Visit> getPatientVisit(List<Visit> visits, Patient patient) {
        return visits.stream().filter(v -> v.getMedicalCardId() == patient.getMedCardId()).collect(Collectors.toList());
    }
}
