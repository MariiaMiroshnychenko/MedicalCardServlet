package card.controller.servlet.extention;

import card.controller.servlet.EntityServlet;
import model.services.implementation.CreateMedicalCard;
import model.entity.MedicalCard;
import view.PagesConstant;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class MedCardServlet extends EntityServlet implements PagesConstant {
    @Override
    public void setServletAttribute(HttpServletRequest req) {
        CreateMedicalCard createMedicalCard = new CreateMedicalCard();

        List<MedicalCard> medcards = createMedicalCard.create();

        req.setAttribute("medcards", medcards);
    }

    @Override
    public void setServletDispatcher(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.getRequestDispatcher(MEDICAL_CARD).forward(req, resp);
    }
}