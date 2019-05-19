package model.services.implementation;

import model.entity.Doctor;
import model.MedicalCard;
import model.entity.Patient;
import model.entity.Visit;
import model.jdbc.dao.extention.JdbcFactoryDao;
import model.services.MedicalCardCreation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CreateMedicalCard implements MedicalCardCreation<MedicalCard> {
    @Override
    public List<MedicalCard> create() {
        List<MedicalCard> medicalCards = new ArrayList<>();

        List<Doctor> doctors = new JdbcFactoryDao().getDoctorJdbcDao().getAll();
        List<Visit> visits = new JdbcFactoryDao().getVisitJdbcDao().getAll();
        List<Patient> patients = new JdbcFactoryDao().getPatientJdbcDao().getAll();

        for (Patient patient : patients) {
            MedicalCard medicalCard = new MedicalCard();

            medicalCard.setPatient(patient);
            medicalCard.setDoctor(getPatientDoctor(doctors, medicalCard.getPatient()));
            medicalCard.setVisits(getPatientVisit(visits, medicalCard.getPatient()));

            medicalCards.add(medicalCard);
        }

        return medicalCards;
    }

    private Doctor getPatientDoctor(List<Doctor> doctors, Patient patient) {
        return doctors
                .stream()
                .filter(d -> d.getDoctorId() == patient.getDoctorId())
                .findFirst()
                .get();
    }

    private List<Visit> getPatientVisit(List<Visit> visits, Patient patient) {
        return visits
                .stream()
                .filter(v -> v.getMedicalCardId() == patient.getMedCardId())
                .collect(Collectors.toList());
    }
}
