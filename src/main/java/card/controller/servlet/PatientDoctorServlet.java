package card.controller.servlet;

import model.entity.PatientDoctorLink;
import model.jdbc.JdbcFactoryDao;
import view.PagesConstant;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class PatientDoctorServlet extends EntityServlet implements PagesConstant{
    List<PatientDoctorLink> entitiesList = getAllEntities();

    public List<PatientDoctorLink> getAllEntities() {
        return JdbcFactoryDao.getInstance().getPatientDoctorJdbcDao().getAll();
    }
    @Override
    public void setServletAttribute(HttpServletRequest req) {
        req.setAttribute("patientDoctors", getAllEntities());
    }

    @Override
    public void setServletDispatcher(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher(PATIENT_DOCTOR).forward(req, resp);
    }
}
