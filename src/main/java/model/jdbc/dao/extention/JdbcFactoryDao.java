package model.jdbc.dao.extention;

import model.jdbc.dao.FactoryDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcFactoryDao extends FactoryDao {
    @Override
    public PatientJdbcDao getPatientJdbcDao() {
        return new PatientJdbcDao(getConnection());
    }

    @Override
    public DoctorJdbcDao getDoctorJdbcDao() {
        return new DoctorJdbcDao(getConnection());
    }

    @Override
    public VisitJdbcDao getVisitJdbcDao() {
        return new VisitJdbcDao(getConnection());
    }

    private Connection getConnection() {
        try {
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            return DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/medical_information_system?" +
                                                    "serverTimezone=UTC",
                    "root",
                    "root");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}