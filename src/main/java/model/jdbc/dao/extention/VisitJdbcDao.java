package model.jdbc.dao.extention;

import model.entity.Visit;
import model.jdbc.dao.EntityJdbcDao;
import view.QueryConstants;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;


public class VisitJdbcDao extends EntityJdbcDao<Visit> implements QueryConstants {
    VisitJdbcDao(Connection connection) {
        super(connection);
    }

    @Override
    public String getQuery() {
        return SELECT_FROM_VISIT;
    }

    @Override
    public Visit extractEntityData(ResultSet results) {
        Visit visit = new Visit();

        try {
            visit.setVisitId(results.getInt(1));
            visit.setVisitDate(results.getDate(2));
            visit.setMedicalCardId(results.getInt(3));
            visit.setDiagnosis(results.getString(4));
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return visit;
    }
}