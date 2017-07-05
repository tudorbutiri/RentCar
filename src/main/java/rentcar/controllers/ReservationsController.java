package rentcar.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import rentcar.data.CarData;
import rentcar.data.CarTypeData;
import rentcar.data.CustomerData;
import rentcar.dto.BookingDataDTO;
import rentcar.facade.BookingDatesFacade;

import javax.servlet.http.HttpSession;
import java.security.Principal;
import java.util.List;

@Controller
public class ReservationsController {

    private static final Logger logger = LoggerFactory.getLogger(ReservationsController.class);

    @Autowired
    BookingDatesFacade bookingDatesFacade;

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

    @RequestMapping(value="/reservations" , method = RequestMethod.POST)
    public ModelAndView postLogin(@ModelAttribute("availableCarsModelAttribute") BookingDataDTO bookingDataDTO, HttpSession httpSession, Model model)
    {
        ModelAndView returnPage = new ModelAndView();
        //gets all the indexes
        List<CarData> unavailableCarDatas = bookingDatesFacade.getCarDataFromBookingInterval(bookingDataDTO);
        List<CarTypeData> carTypeDatas = bookingDatesFacade.getAllCarTypesData(unavailableCarDatas);

        returnPage.addObject("listCarTypes", carTypeDatas);

        returnPage.addObject("bookingDataDTO", bookingDataDTO);
        returnPage.setViewName("reservations");

        return returnPage;
    }
}
