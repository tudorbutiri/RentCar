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
public class ForgotPasswordController {

    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    LoginUserFacade loginUserFacade;

    @Autowired
    AddCustomerDataService addCustomerDataService;

    @Autowired
    CustomerFullDetailsFacade customerFullDetailsFacade;

    @RequestMapping(value="/forgotpassword", method = RequestMethod.GET)
    public ModelAndView getForgotPassword()
    {
        ModelAndView page = new ModelAndView();
        page.addObject("forgotPasswordModelAttribute", new CustomerDataDTO());
        page.setViewName("forgotpassword");
        return page;
    }

    @RequestMapping(value="/forgotpassword" , method = RequestMethod.POST)
    public ModelAndView postForgotPassword(@ModelAttribute("forgotPasswordModelAttribute") CustomerDataDTO customerDataDTO)
    {
        ModelAndView page = new ModelAndView();

        CustomerData customerData = addCustomerDataService.getCustomerAfterEmail(customerDataDTO.getEmail());

        //checks if the user and pass match to an existing record from DB
        boolean advEmail = loginUserFacade.checkCustomerEmailData(customerData);
        if (advEmail == true)
        {
            //setting the user to the current session
            customerFullDetailsFacade.updateCustomerDataPassword(customerDataDTO, customerData);
            page.addObject("loginSuccessful", "Password has been updated successfuly!");
            page.setViewName("forgotpassword");
            return page;
        }
        else
        {
            page.addObject("badEmailOrPassword", "Email address is not valid!");
            page.setViewName("forgotpassword");
            return page;
        }
    }

}
