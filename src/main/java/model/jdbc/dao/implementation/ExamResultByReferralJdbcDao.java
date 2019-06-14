package model.jdbc.dao.implementation;

import model.entity.ExamResultByReferral;
import model.jdbc.dao.EntityJdbcDao;

import java.sql.Connection;
import java.sql.ResultSet;

public class ExamResultByReferralJdbcDao extends EntityJdbcDao<ExamResultByReferral> {
    public ExamResultByReferralJdbcDao(Connection connection) {
        super(connection);
    }



    @Override
    public String getQuery() {
        return null;
    }

    @Override
    public ExamResultByReferral extractEntityData(ResultSet results) {
        return null;
    }
}
