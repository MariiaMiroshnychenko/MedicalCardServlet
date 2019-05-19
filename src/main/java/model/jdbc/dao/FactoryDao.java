package model.jdbc.dao;

import model.entity.Doctor;
import model.entity.Visit;
import model.jdbc.dao.extension.DoctorJdbcDao;
import model.jdbc.dao.extension.JdbcFactoryDao;
import model.jdbc.dao.extension.PatientJdbcDao;

import java.util.Optional;

public abstract class FactoryDao {
    private static Optional<FactoryDao> factory = Optional.empty();

    public abstract PatientJdbcDao getPatientJdbcDao();
    public abstract DoctorJdbcDao getDoctorJdbcDao();
    public abstract EntityJdbcDao<Visit> getVisitJdbcDao();

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
