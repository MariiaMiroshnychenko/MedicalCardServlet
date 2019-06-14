package model.jdbc.dao.implementation;

import model.entity.MedicalEmployee;
import model.jdbc.dao.EntityJdbcDao;

import java.sql.Connection;
import java.sql.ResultSet;

public class MedicalEmployeeJdbcDao extends EntityJdbcDao<MedicalEmployee> {
    public MedicalEmployeeJdbcDao(Connection connection) {
        super(connection);
    }

    @Override
    public String getQuery() {
        return null;
    }

    @Override
    public MedicalEmployee extractEntityData(ResultSet results) {
        return null;
    }
}
