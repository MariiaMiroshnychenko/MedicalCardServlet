package model.jdbc.dao;

import model.entity.Doctor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DoctorJdbcDao implements EntityDao<Doctor> {
    List<Doctor> doctors = new ArrayList<>();
Connection connection;

    public DoctorJdbcDao(Connection connection) {
        this.connection = connection;
    }

    @Override
    public List<Doctor> getAll() {
        try (PreparedStatement statement = connection.prepareStatement(getQuery())) {
            ResultSet results = statement.executeQuery();

            while (results.next()) {
                int doctorId = results.getInt(1);
                String doctorSurname = results.getString(2);
                String doctorFirstName = results.getString(3);
                String doctorSecondName = results.getString(4);

                Doctor doctor = new Doctor();

                doctor.setDoctorId(doctorId);
                doctor.setDoctorSurname(doctorSurname);
                doctor.setDoctorFirstName(doctorFirstName);
                doctor.setDoctorSecondName(doctorSecondName);

                doctors.add(doctor);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return doctors;
    }

    public String getQuery() {
        return "select * from doctor";
    }
}
