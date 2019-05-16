package model.jdbc.dao;

import model.entity.Doctor;
import model.entity.Patient;
import model.entity.Visit;
import view.ColumnNumberConstant;
import view.QueryConstants;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PatientJdbcDao implements EntityDao, QueryConstants {
//    List<Patient> patients = new ArrayList<>();
    private Connection connection;

    public PatientJdbcDao(Connection connection) {
        this.connection = connection;
    }

    @Override
    public List<Patient> getAll() {
        List<Patient> patientList = new ArrayList<>();
//        Map<Integer, Patient> visitMap = new HashMap<>();
        try (PreparedStatement statement = connection.prepareStatement(getQuery())) {
            ResultSet results = statement.executeQuery();

            while (results.next()) {
                Patient patient = getPatientData(results);
//                Visit visit = VisitJdbcDao.getVisitData(results);
//                makeUniquePatient(visitMap, patient, visit);
                patientList.add(patient);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return patientList;
    }

    public static Patient getPatientData(ResultSet results) throws SQLException {
        Patient patient = new Patient();

        patient.setPatientId(results.getInt(1));
        patient.setSurname(results.getString(2));
        patient.setFirstName(results.getString(3));
        patient.setSecondName(results.getString(4));
        patient.setMedicalCardId(results.getInt(5));
        return patient;
    }

    public String getQuery() {
        return SELECT_FROM_PATIENT;
    }
}
