package model.jdbc.dao;

import model.entity.Doctor;
import model.entity.PatientDoctorLink;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PatientDoctorJdbcDao implements EntityDao<PatientDoctorLink> {
    List<PatientDoctorLink> patientDoctors = new ArrayList<>();
Connection connection;

    public PatientDoctorJdbcDao(Connection connection) {
        this.connection = connection;
    }

    @Override
    public List<PatientDoctorLink> getAll() {
        try (PreparedStatement statement = connection.prepareStatement(getQuery())) {
            ResultSet results = statement.executeQuery();

            while (results.next()) {
                int patientId = results.getInt(1);
                int doctorId = results.getInt(2);

                PatientDoctorLink patientDoctor = new PatientDoctorLink();

                patientDoctor.setPatientId(patientId);
                patientDoctor.setDoctorId(doctorId);

                patientDoctors.add(patientDoctor);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return patientDoctors;
    }

    public String getQuery() {
        return "select * from patient_doctor_link";
    }
}

