package card.controller.servlet;

import model.entity.Visit;
import model.jdbc.JdbcFactoryDao;
import view.PagesConstant;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class VisitServlet extends EntityServlet implements PagesConstant{
    List<Visit> entitiesList = getAllEntities();

    public List<Visit> getAllEntities() {
        return JdbcFactoryDao.getInstance().getVisitJdbcDao().getAll();
    }

    @Override
    public void setServletAttribute(HttpServletRequest req) {
        req.setAttribute("visits", getAllEntities());
    }

    @Override
    public void setServletDispatcher(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher(VISIT).forward(req, resp);
    }
}
