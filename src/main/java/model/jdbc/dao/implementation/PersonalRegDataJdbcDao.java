package model.jdbc.dao.implementation;

import model.entity.PersonalRegData;
import model.jdbc.dao.EntityJdbcDao;

import java.sql.Connection;
import java.sql.ResultSet;

public class PersonalRegDataJdbcDao extends EntityJdbcDao<PersonalRegData> {
    public PersonalRegDataJdbcDao(Connection connection) {
        super(connection);
    }

    @Override
    public String getQuery() {
        return null;
    }

    @Override
    public PersonalRegData extractEntityData(ResultSet results) {
        return null;
    }
}
