package card.controller.servlet;

import model.entity.Patient;
import model.entity.Visit;
import model.jdbc.JdbcFactoryDao;
import view.PagesConstant;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class PatientServlet extends EntityServlet implements PagesConstant {
//    List<Patient> entitiesList = getAllEntities();

    public List<Patient> getAllEntities() {
        return JdbcFactoryDao.getInstance().getPatientJdbcDao().getAll();
    }
    @Override
    public void setServletAttribute(HttpServletRequest req) {
        req.setAttribute("patients", getAllEntities());
    }

    @Override
    public void setServletDispatcher(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher(INDEX).forward(req, resp);
    }
}
