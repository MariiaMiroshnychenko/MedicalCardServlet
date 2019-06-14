package model.jdbc.dao.implementation;

import model.entity.*;
import model.jdbc.dao.EntityJdbcDao;
import model.jdbc.dao.FactoryDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcFactoryDao extends FactoryDao {

    @Override
    public EntityJdbcDao<ExamResultByReferral> getExamResultByReferralJdbcDao() {
        return new ExamResultByReferralJdbcDao(getConnection());
    }

    @Override
    public EntityJdbcDao<MedicalCard> getMedicalCardJdbcDao() {
        return new MedicalCardJdbcDao(getConnection());
    }

    @Override
    public EntityJdbcDao<MedicalEmployee> getMedicalEmployeeJdbcDao() {
        return new MedicalEmployeeJdbcDao(getConnection());
    }

    @Override
    public EntityJdbcDao<Patient> getPatientJdbcDao() {
        return new PatientJdbcDao(getConnection());
    }

    @Override
    public EntityJdbcDao<PatientVisit> getPatientVisitJdbcDao() {
        return new PatientVisitJdbcDao(getConnection());
    }

    @Override
    public EntityJdbcDao<PersonalRegData> getPersonalRegDataJdbcDao() {
        return new PersonalRegDataJdbcDao(getConnection());
    }

    @Override
    public EntityJdbcDao<Referral> getReferralJdbcDao() {
        return new ReferralJdbcDao(getConnection());
    }

    @Override
    public EntityJdbcDao<Role> getRoleJdbcDao() {
        return new RoleJdbcDao(getConnection());
    }

    private Connection getConnection() {
        try {
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            return DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/medicine?" +
                                                    "serverTimezone=UTC",
                    "root",
                    "root");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}