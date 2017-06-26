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
import rentcar.data.CustomerAddressData;
import rentcar.data.CustomerData;
import rentcar.dto.CustomerDataDTO;
import rentcar.facade.CustomerFullDetailsFacade;
import rentcar.facade.LoginUserFacade;
import rentcar.services.AddCustomerDataService;

import javax.servlet.http.HttpSession;

@Controller
public class ChangePasswordController {

    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    LoginUserFacade loginUserFacade;

    @Autowired
    AddCustomerDataService addCustomerDataService;

    @Autowired
    CustomerFullDetailsFacade customerFullDetailsFacade;

    @RequestMapping(value="/changepassword" , method = RequestMethod.GET)
    public String getChangePassword(Model model, HttpSession httpSession)
    {
        if ((httpSession.getAttribute("customer") == null) && (httpSession.getAttribute("customeraddress") == null))
        {
            model.addAttribute("loginSuccessful", "Please login or create a user in order to access the account page");
            return "login";
        }
        else
        {
            model.addAttribute("customer",  new CustomerData());
            return "changeaccountdetails";
        }
    }

    @RequestMapping(value="/changepassword" , method = RequestMethod.POST)
    public String postLogin(@ModelAttribute("changepassword") CustomerDataDTO customerDataDTO, HttpSession httpSession)
    {
        CustomerData customerData = (CustomerData) httpSession.getAttribute("customer");
        customerFullDetailsFacade.updateCustomerDataPassword(customerDataDTO, customerData);

        return "myaccount";
    }

}
