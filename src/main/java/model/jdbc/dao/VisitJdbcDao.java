package model.jdbc.dao;

import model.entity.Patient;
import model.entity.Visit;
import view.ColumnNumberConstant;
import view.QueryConstants;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//public class VisitJdbcDao implements EntityDao<Visit>, QueryConstants, ColumnNumberConstant {
//    private Connection connection;
//
//    public VisitJdbcDao(Connection connection) {
//        this.connection = connection;
//    }
//
//    @Override
//    public List<Visit> getAll() {
//        List<Visit> visits = new ArrayList<>();
//        Map<Integer, Patient> patientMap = new HashMap<>();
//
//        try (PreparedStatement statement = connection.prepareStatement(getQuery())) {
//            ResultSet results = statement.executeQuery();
//
//            while (results.next()) {
//                Visit visit = getVisitData(results);
//                Patient patient = PatientJdbcDao.getPatientData(results);
//
//                makeUniquePatient(patientMap, visit, patient);
//
//                visits.add(visit);
//            }
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return visits;
//    }
//
//    private void makeUniquePatient(Map<Integer, Patient> patientMap, Visit visit, Patient patient) {
//        patientMap.putIfAbsent(patient.getMedCardId(), patient);
//
//        patient = patientMap.get(patient.getMedCardId());
//
//        visit.setPatient(patient);
//        patient.getVisits().add(visit);
//    }
//
//    public static Visit getVisitData(ResultSet results) throws SQLException {
//        Visit visit = new Visit();
//
//        visit.setVisitId(results.getInt(1));
//        visit.setVisitDate(results.getDate(2));
//        visit.setMedCardId(results.getInt(3));
//        visit.setDiagnosis(results.getString(4));
//        return visit;
//    }
//
//    public String getQuery() {
//        return SELECT_JOIN;
//    }
//}

public class VisitJdbcDao implements EntityDao<Visit>, QueryConstants, ColumnNumberConstant {
    private List<Visit> visits = new ArrayList<>();
    private Connection connection;

    public VisitJdbcDao(Connection connection) {
        this.connection = connection;
    }

    @Override
    public List<Visit> getAll() {
        try (PreparedStatement statement = connection.prepareStatement(getQuery())) {
            ResultSet results = statement.executeQuery();

            while (results.next()) {
                Visit visit = getVisitData(results);

                visits.add(visit);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return visits;
    }

    public static Visit getVisitData(ResultSet results) throws SQLException {
        Visit visit = new Visit();

        visit.setVisitId(results.getInt(1));
        visit.setVisitDate(results.getDate(2));
        visit.setMedicalCardId(results.getInt(3));
        visit.setDiagnosis(results.getString(4));
        return visit;
    }

    public String getQuery() {
        return SELECT_FROM_VISIT;
    }
}
