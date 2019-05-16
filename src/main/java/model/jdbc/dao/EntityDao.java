package model.jdbc.dao;

import java.util.List;

public interface EntityDao<T>{
    List<T> getAll();
}
