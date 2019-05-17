package model.jdbc;

import model.jdbc.dao.DoctorJdbcDao;
import model.jdbc.dao.PatientJdbcDao;
import model.jdbc.dao.VisitJdbcDao;

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


    Connection getConnection() {
        Connection connection = null;

        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/medical_information_system?useSSL=false&serverTimezone=UTC", "root", "root");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }


}