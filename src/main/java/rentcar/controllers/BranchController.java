package rentcar.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import rentcar.facade.BookingDatesFacade;

import javax.servlet.http.HttpSession;

@Controller
public class BranchController {

    private static final Logger logger = LoggerFactory.getLogger(BranchController.class);

    @RequestMapping(value="/branches" , method = RequestMethod.GET)
    public String getReservationView(Model model, HttpSession httpSession)
    {
        return "branches";
    }
}
