package model.jdbc.dao.implementation;

import model.entity.Role;
import model.jdbc.dao.EntityJdbcDao;

import java.sql.Connection;
import java.sql.ResultSet;

public class RoleJdbcDao extends EntityJdbcDao<Role> {
    public RoleJdbcDao(Connection connection) {
        super(connection);
    }

    @Override
    public String getQuery() {
        return null;
    }

    @Override
    public Role extractEntityData(ResultSet results) {
        return null;
    }
}
