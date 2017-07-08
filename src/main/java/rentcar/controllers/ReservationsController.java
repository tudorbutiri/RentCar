package rentcar.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import rentcar.dao.BranchDataDAO;
import rentcar.data.BranchData;
import rentcar.data.CarData;
import rentcar.data.CarTypeData;
import rentcar.data.CustomerData;
import rentcar.dto.BookingDataDTO;
import rentcar.dto.BranchDataDTO;
import rentcar.facade.BookingDatesFacade;
import rentcar.services.BookingDataService;

import javax.servlet.http.HttpSession;
import java.security.Principal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class ReservationsController {

    private static final Logger logger = LoggerFactory.getLogger(ReservationsController.class);

    @Autowired
    BookingDatesFacade bookingDatesFacade;

    @Autowired
    BookingDataService bookingDataService;

    @RequestMapping(value="/reservations" , method = RequestMethod.GET)
    public ModelAndView getReservationView(HttpSession httpSession)
    {
        ModelAndView returnPage = new ModelAndView();

        if ((httpSession.getAttribute("customer") == null) && (httpSession.getAttribute("customeraddress") == null))
        {
            returnPage.addObject("badEmailOrPassword", "Please login or create a user in order to acces the reservation page");
            returnPage.setViewName("login");

            return returnPage;
        }
        else
        {
            List<BranchData> allBranches = bookingDataService.getAllBranches();
            returnPage.addObject("allBranches", allBranches);
            returnPage.setViewName("reservations");

            return returnPage;
        }
    }

    @RequestMapping(value="/reservations" , method = RequestMethod.POST)
    public ModelAndView postAvailableCars(@ModelAttribute("availableCarsModelAttribute") BookingDataDTO bookingDataDTO, BranchDataDTO branchDataDTO)
    {
        ModelAndView returnPage = new ModelAndView();
        //gets all the indexes
        List<CarData> unavailableCarDatas = bookingDatesFacade.getCarDataFromBookingInterval(bookingDataDTO);
        List<CarTypeData> carTypeDatas = bookingDatesFacade.getAllCarTypesData(unavailableCarDatas);
        List<BranchData> allBranches = bookingDataService.getAllBranches();


        if(bookingDataDTO.getBranchData() != null && bookingDataDTO.getBranchData().getId() != null){
            for(BranchData branch : allBranches){
                if(branch.getId().equals(bookingDataDTO.getBranchData().getId())) {
                    bookingDataDTO.setBranchData(branch);
                }
            }
        }

        returnPage.addObject("allBranches", allBranches);
        returnPage.addObject("listCarTypes", carTypeDatas);
        returnPage.addObject("branchDataDTO", branchDataDTO);
        returnPage.addObject("bookingDataDTO", bookingDataDTO);

        returnPage.setViewName("reservations");

        return returnPage;
    }

    @RequestMapping(value="/reservationsbooking", method = RequestMethod.POST)
    public ModelAndView postReservationBooking(@ModelAttribute("placebooking") BookingDataDTO bookingDataDTO, HttpSession session)
    {
        ModelAndView page = new ModelAndView();
        bookingDataDTO.setCustomer((CustomerData)session.getAttribute("customer"));
        if (bookingDatesFacade.setBooking(bookingDataDTO))
        {
            page.addObject("loginSuccessful", "The reservation was successful!");
            page.setViewName("reservations");
            return page;
        }
        else
        {
            page.addObject("loginSuccessful", "Error while making the reservation! Please try again later!");
            page.setViewName("reservations");
            return page;
        }
    }
}
