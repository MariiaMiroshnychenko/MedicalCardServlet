package model.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public abstract class EntityJdbcDao<T> {
    private Connection connection;

    public EntityJdbcDao(Connection connection) {
        this.connection = connection;
    }

    public List<T> getAll() {
        List<T> list = new ArrayList<>();

        try (PreparedStatement statement = connection.prepareStatement(getQuery())) {
            ResultSet results = statement.executeQuery();

            while (results.next()) {
                T t = extractEntityData(results);

                list.add(t);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public abstract String getQuery ();
    public abstract T extractEntityData(ResultSet results);
}