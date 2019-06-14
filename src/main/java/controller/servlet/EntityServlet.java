package controller.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public abstract class EntityServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF8");

        setServletAttribute(req);

        setServletDispatcher(req, resp);
    }

    public abstract void setServletDispatcher(HttpServletRequest req, HttpServletResponse resp)
                  throws ServletException, IOException;

    public abstract void setServletAttribute(HttpServletRequest req);
}