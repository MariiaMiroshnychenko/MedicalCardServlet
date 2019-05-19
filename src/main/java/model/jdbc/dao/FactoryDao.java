package model.jdbc.dao;

import model.jdbc.dao.extention.DoctorJdbcDao;
import model.jdbc.dao.extention.JdbcFactoryDao;
import model.jdbc.dao.extention.PatientJdbcDao;

import java.util.Optional;

public abstract class FactoryDao {
    private static Optional<FactoryDao> factory = Optional.empty();

    public abstract PatientJdbcDao getPatientJdbcDao();
    public abstract DoctorJdbcDao getDoctorJdbcDao();
    public abstract EntityJdbcDao getVisitJdbcDao();

    public static FactoryDao getInstance() {
        if (!factory.isPresent()) {
            synchronized (FactoryDao.class) {
                if (!factory.isPresent()) {
                    factory = Optional.of(new JdbcFactoryDao());
                }
            }
        }
        return factory.get();
    }

}
