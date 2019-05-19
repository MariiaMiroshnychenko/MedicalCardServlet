package model.jdbc.dao.extention;

import model.entity.Doctor;
import model.jdbc.dao.EntityJdbcDao;
import view.QueryConstants;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DoctorJdbcDao extends EntityJdbcDao<Doctor> implements QueryConstants {
    DoctorJdbcDao(Connection connection) {
        super(connection);
    }

    @Override
    public String getQuery() {
        return SELECT_FROM_DOCTOR;
    }

    @Override
    public Doctor extractEntityData(ResultSet results) {
        Doctor doctor = new Doctor();

        try {
            doctor.setDoctorId(results.getInt(1));
            doctor.setDoctorSurname(results.getString(2));
            doctor.setDoctorFirstName(results.getString(3));
            doctor.setDoctorSecondName(results.getString(4));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return doctor;
    }
}