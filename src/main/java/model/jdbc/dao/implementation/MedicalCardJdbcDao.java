package model.jdbc.dao.implementation;

import model.entity.MedicalCard;
import model.jdbc.dao.EntityJdbcDao;

import java.sql.Connection;
import java.sql.ResultSet;

public class MedicalCardJdbcDao extends EntityJdbcDao<MedicalCard> {
    public MedicalCardJdbcDao(Connection connection) {
        super(connection);
    }

    @Override
    public String getQuery() {
        return null;
    }

    @Override
    public MedicalCard extractEntityData(ResultSet results) {
        return null;
    }
}
