package model.jdbc.dao.implementation;

import model.entity.PatientVisit;
import model.jdbc.dao.EntityJdbcDao;

import java.sql.Connection;
import java.sql.ResultSet;

public class PatientVisitJdbcDao extends EntityJdbcDao<PatientVisit> {
    public PatientVisitJdbcDao(Connection connection) {
        super(connection);
    }

    @Override
    public String getQuery() {
        return null;
    }

    @Override
    public PatientVisit extractEntityData(ResultSet results) {
        return null;
    }
}
