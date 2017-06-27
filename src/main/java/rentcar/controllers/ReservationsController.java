package rentcar.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import rentcar.data.CustomerData;
import javax.servlet.http.HttpSession;
import java.security.Principal;

@Controller
public class ReservationsController {

    private static final Logger logger = LoggerFactory.getLogger(ReservationsController.class);

    @RequestMapping(value="/reservations" , method = RequestMethod.GET)
    public String getReservationView(Model model, HttpSession httpSession)
    {
        if ((httpSession.getAttribute("customer") == null) && (httpSession.getAttribute("customeraddress") == null))
        {
            model.addAttribute("badEmailOrPassword", "Please login or create a user in order to acces the reservation page");
            return "login";
        }
        else return "reservations";
    }
}
