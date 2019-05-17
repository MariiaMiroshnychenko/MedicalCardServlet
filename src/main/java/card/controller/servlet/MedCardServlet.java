package card.controller.servlet;

import model.services.CreateMedicalCard;
import model.services.MedicalCard;
import view.PagesConstant;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class MedCardServlet extends EntityServlet implements PagesConstant {
    CreateMedicalCard createMedicalCard = new CreateMedicalCard();

    public List<MedicalCard> getAllMedicalCards() {
        return createMedicalCard.create();
    }

    @Override
    public void setServletAttribute(HttpServletRequest req) {
        req.setAttribute("medcards", getAllMedicalCards());
    }

    @Override
    public void setServletDispatcher(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher(MEDICAL_CARD).forward(req, resp);
    }
}
