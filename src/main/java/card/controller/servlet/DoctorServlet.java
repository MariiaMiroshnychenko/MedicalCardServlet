package card.controller.servlet;

import model.entity.Doctor;
import model.jdbc.JdbcFactoryDao;
import view.PagesConstant;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class DoctorServlet extends EntityServlet implements PagesConstant {

    List<Doctor> entitiesList = getAllEntities();

    public List<Doctor> getAllEntities() {
        return JdbcFactoryDao.getInstance().getDoctorJdbcDao().getAll();
    }

    @Override
    public void setServletAttribute(HttpServletRequest req) {
        req.setAttribute("doctors", getAllEntities());
    }

    @Override
    public void setServletDispatcher(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher(DOCTOR).forward(req, resp);
    }
}
