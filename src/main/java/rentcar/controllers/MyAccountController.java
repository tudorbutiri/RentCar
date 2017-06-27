package rentcar.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import rentcar.data.CustomerData;
import rentcar.dto.CustomerAddressDataDTO;
import rentcar.dto.CustomerDataDTO;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
public class MyAccountController {

    private static final Logger logger = LoggerFactory.getLogger(MyAccountController.class);

    @RequestMapping(value="/myaccount" , method = RequestMethod.GET)
    public String getRegister(Model model, HttpSession httpSession)
    {
        if ((httpSession.getAttribute("customer") == null) ||(httpSession.getAttribute("customeraddress") == null))
        {
            model.addAttribute("badEmailOrPassword", "Please login or create a user in order to access the account page");
            return "login";
        }
        else
        {
            model.addAttribute("customer",  httpSession.getAttribute("customer"));
            model.addAttribute("customerAddress", httpSession.getAttribute("customeraddress"));
            return "myaccount";
        }
    }
}