package model.jdbc.dao.implementation;

import model.entity.Referral;
import model.jdbc.dao.EntityJdbcDao;

import java.sql.Connection;
import java.sql.ResultSet;

public class ReferralJdbcDao extends EntityJdbcDao<Referral> {
    public ReferralJdbcDao(Connection connection) {
        super(connection);
    }

    @Override
    public String getQuery() {
        return null;
    }

    @Override
    public Referral extractEntityData(ResultSet results) {
        return null;
    }
}
