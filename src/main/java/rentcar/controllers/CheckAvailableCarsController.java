package rentcar.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import rentcar.data.BookingData;
import rentcar.data.CarTypeData;
import rentcar.data.CustomerData;
import rentcar.dto.BookingDataDTO;
import rentcar.dto.CustomerDataDTO;
import rentcar.facade.BookingDatesFacade;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Controller
public class CheckAvailableCarsController {

    private static final Logger logger = LoggerFactory.getLogger(CheckAvailableCarsController.class);

    @Autowired
    BookingDatesFacade bookingDatesFacade;

    @RequestMapping(value="/checkavailablecars" , method = RequestMethod.POST)
    public String postLogin(@ModelAttribute("availableCarsModelAttribute") BookingDataDTO bookingDataDTO, HttpSession httpSession, Model model)
    {
        //gets all the indexes
        System.out.println("aici: " + bookingDataDTO.getBookingDate() + bookingDataDTO.getReturnDate());
        Date test = (Date) bookingDataDTO.getBookingDate();
        Date test2 = (Date) bookingDataDTO.getReturnDate();
        System.out.println("aici: " + test + test2);
        Set set1 = bookingDatesFacade.getAllCarDataIDFromBookingInterval(bookingDataDTO);
        Set set2 = bookingDatesFacade.getAllCarTypesWithIndexes(set1);
        List<CarTypeData> listCarTypeData = bookingDatesFacade.getCarTypeAfterCarTypeId(set2);
        model.addAttribute("listCarTypes", listCarTypeData);

        return "checkavailablecars";
    }

}
