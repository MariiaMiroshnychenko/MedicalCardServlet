package model.services.implementation;

import model.MedicalCard;
import model.entity.Doctor;
import model.entity.Patient;
import model.entity.Visit;
import model.jdbc.dao.extension.JdbcFactoryDao;
import model.services.AllCardsCreator;

import java.util.ArrayList;
import java.util.List;

public abstract class MedicalCardCreation implements AllCardsCreator {
    public List<MedicalCard> createCard() {
        List<MedicalCard> medicalCards = new ArrayList<>();

        List<Patient> patients = new JdbcFactoryDao().getPatientJdbcDao().getAll();
        List<Doctor> doctors = new JdbcFactoryDao().getDoctorJdbcDao().getAll();
        List<Visit> visits = new JdbcFactoryDao().getVisitJdbcDao().getAll();

        for (Patient patient : patients) {
            MedicalCard medicalCard = new MedicalCard();

            extractMedCardData(medicalCard, patient, doctors, visits);

            medicalCards.add(medicalCard);
        }
        return medicalCards;
    }

    public abstract void extractMedCardData(MedicalCard medicalCard, Patient patient, List<Doctor> doctors, List<Visit> visits);
}