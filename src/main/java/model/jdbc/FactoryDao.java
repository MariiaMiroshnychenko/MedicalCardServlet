package model.jdbc;

import model.jdbc.dao.DoctorJdbcDao;
import model.jdbc.dao.PatientDoctorJdbcDao;
import model.jdbc.dao.PatientJdbcDao;
import model.jdbc.dao.VisitJdbcDao;

import java.util.Optional;

public abstract class FactoryDao {
    private static Optional<FactoryDao> factory = Optional.empty();

    public abstract PatientJdbcDao getPatientJdbcDao();
    public abstract DoctorJdbcDao getDoctorJdbcDao();
    public abstract PatientDoctorJdbcDao getPatientDoctorJdbcDao();
    public abstract VisitJdbcDao getVisitJdbcDao();

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
