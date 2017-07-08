package rentcar.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
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
import rentcar.utils.CustomerDataLoginValidator;
import rentcar.utils.LoginCredentialsValidator;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@Controller
public class LoginController
{
    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    LoginUserFacade loginUserFacade;

    @Autowired
    AddCustomerDataService addCustomerDataService;

    @RequestMapping(value="/login" , method = RequestMethod.GET)
    public ModelAndView getLogin()
    {
        ModelAndView page = new ModelAndView();
        page.addObject("loginDataModelAttribute", new CustomerDataDTO());
        page.setViewName("login");
        return page;
    }

    @RequestMapping(value="/login" , method = RequestMethod.POST)
    public ModelAndView postLogin(@ModelAttribute("loginDataModelAttribute") CustomerDataDTO customerDataDTO, HttpSession httpSession)
    {
        ModelAndView page = new ModelAndView();

        CustomerData customerData = addCustomerDataService.getCustomerAfterEmail(customerDataDTO.getEmail());

        //checks if the user and pass match to an existing record from DB
        boolean advLogin = loginUserFacade.checkCustomerLoginData(customerDataDTO, customerData);
        if (advLogin == true)
        {
            CustomerAddressData customerAddressData = addCustomerDataService.getCustomerAddressDataAfterCustomerID(customerData.getId());
            //setting the user to the current session

            httpSession.setAttribute("customer", customerData);
            httpSession.setAttribute("customerAddress", customerAddressData);

            page.addObject("badEmailOrPassword", "Login successful!");
            page.setViewName("login");
            return page;
        }
        else
        {
            page.addObject("badEmailOrPassword", "Email or Password are incorrect!");
            page.setViewName("login");
            return page;
        }
    }

    @RequestMapping(value="/logout" , method = RequestMethod.GET)
    public ModelAndView getLogOut(HttpSession httpSession)
    {
        httpSession.invalidate();
        ModelAndView page = new ModelAndView();
        page.setViewName("index");
        return page;
    }
}
