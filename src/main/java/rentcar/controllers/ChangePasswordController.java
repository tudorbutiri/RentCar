package rentcar.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import rentcar.data.CustomerAddressData;
import rentcar.data.CustomerData;
import rentcar.dto.CustomerDataDTO;
import rentcar.facade.CustomerFullDetailsFacade;
import rentcar.facade.LoginUserFacade;
import rentcar.services.AddCustomerDataService;

import javax.servlet.http.HttpSession;

@Controller
public class ChangePasswordController {

    private static final Logger logger = LoggerFactory.getLogger(ChangePasswordController.class);

    @Autowired
    CustomerFullDetailsFacade customerFullDetailsFacade;

    @RequestMapping(value="/changepassword" , method = RequestMethod.GET)
    public ModelAndView getChangePassword(HttpSession httpSession)
    {
        ModelAndView page = new ModelAndView();
        if ((httpSession.getAttribute("customer") == null) && (httpSession.getAttribute("customerAddress") == null))
        {
            page.addObject("loginSuccessful", "Please login or create a user in order to access the account page");
            page.setViewName("login");
            return page;
        }
        else
        {
            page.addObject("customer",  new CustomerDataDTO());
            page.setViewName("changepassword");
            return page;
        }
    }

    @RequestMapping(value="/changepassword" , method = RequestMethod.POST)
    public ModelAndView postLogin(@ModelAttribute("changePasswordModelAttribute") CustomerDataDTO customerDataDTO, HttpSession httpSession)
    {
        ModelAndView page = new ModelAndView();
        CustomerData customerData = (CustomerData) httpSession.getAttribute("customer");
        customerFullDetailsFacade.updateCustomerDataPassword(customerDataDTO, customerData);

        page.addObject("loginSuccessful", "Password has been changed successfuly!");
        page.setViewName("changepassword");
        return page;
    }
}
