package rentcar.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import rentcar.data.CustomerData;
import rentcar.dto.CustomerDataDTO;
import rentcar.facade.CustomerFullDetailsFacade;
import rentcar.facade.LoginUserFacade;
import rentcar.services.AddCustomerDataService;
import rentcar.utils.CustomerDataLoginValidator;
import rentcar.utils.LoginCredentialsValidator;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@Controller
public class LoginController
{
    private static final Logger logger = LoggerFactory.getLogger(RegisterController.class);

    @Autowired
    CustomerFullDetailsFacade customerFullDetailsFacade;

    @Autowired
    LoginUserFacade loginUserFacade;

    @Autowired
    CustomerDataLoginValidator customerDataLoginValidator;

    @Autowired
    LoginCredentialsValidator loginCredentialsValidator;

    @Autowired
    AddCustomerDataService addCustomerDataService;

    @InitBinder()
    private void initBinder(WebDataBinder binder){
        binder.setValidator(customerDataLoginValidator);
    }

    @RequestMapping(value="/login" , method = RequestMethod.GET)
    public ModelAndView getLogin()
    {
        return new ModelAndView("login", "loginData", new CustomerDataDTO());
    }

    @RequestMapping(value="/login" , method = RequestMethod.POST)
    public String postLogin(@ModelAttribute("loginData") CustomerDataDTO customerDataDTO, BindingResult result)
    {
        CustomerData customerData = addCustomerDataService.getCustomerAfterEmail(customerDataDTO.getEmail());
        loginCredentialsValidator.validate(customerDataDTO, result);
        if (result.hasErrors())
        {
            return "login";
        }
        else
        {
            loginUserFacade.checkCustomerLoginData(customerDataDTO);
            return "myaccount";
        }
    }
}
