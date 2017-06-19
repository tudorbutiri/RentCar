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
import rentcar.dto.CustomerDataDTO;
import rentcar.facade.CustomerFullDetailsFacade;
import rentcar.facade.LoginUserFacade;
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
    LoginCredentialsValidator loginCredentialsValidator;

    @InitBinder()
    private void initBinder(WebDataBinder binder){
        binder.setValidator(loginCredentialsValidator);
    }

    @RequestMapping(value="/login" , method = RequestMethod.GET)
    public ModelAndView getLogin()
    {
//        Map<String, Object> map = new HashMap<String, Object>();
//        map.put("customerDataString", new CustomerDataDTO());

        return new ModelAndView("login", "loginData", new CustomerDataDTO());
    }

    @RequestMapping(value="/login" , method = RequestMethod.POST)
    public String postLogin(@ModelAttribute("loginData") @Valid CustomerDataDTO customerDataDTO, BindingResult result)
    {
        if(result.hasErrors())
        {
            return "login";
        }
        else
        {
            return loginUserFacade.checkCustomerLoginData(customerDataDTO);
        }
    }
}
