package controller.servlet.extention;

import controller.servlet.EntityServlet;
import model.entity.Doctor;
import model.entity.Patient;
import model.entity.Visit;
import model.jdbc.dao.extention.JdbcFactoryDao;
import view.PagesConstant;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class PatientServlet extends EntityServlet implements PagesConstant {
    private List<Patient> patients = JdbcFactoryDao.getInstance().getPatientJdbcDao().getAll();
    private List<Doctor> doctors = JdbcFactoryDao.getInstance().getDoctorJdbcDao().getAll();
    private List<Visit> visits = JdbcFactoryDao.getInstance().getVisitJdbcDao().getAll();

    @Override
    public void setServletAttribute(HttpServletRequest req) {
        req.setAttribute("patients", patients);
        req.setAttribute("doctors", doctors);
        req.setAttribute("visits", visits);
    }

    @Override
    public void setServletDispatcher(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.getRequestDispatcher(INDEX).forward(req, resp);
    }
}
