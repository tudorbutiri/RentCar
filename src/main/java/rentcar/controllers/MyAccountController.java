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
import rentcar.data.CustomerData;
import rentcar.dto.CustomerAddressDataDTO;
import rentcar.dto.CustomerDataDTO;
import rentcar.facade.CustomerFullDetailsFacade;
import rentcar.services.AddCustomerDataService;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
public class MyAccountController {

    private static final Logger logger = LoggerFactory.getLogger(MyAccountController.class);

    @RequestMapping(value="/myaccount" , method = RequestMethod.GET)
    public ModelAndView getRegister(HttpSession httpSession)
    {
        ModelAndView page = new ModelAndView();

        if ((httpSession.getAttribute("customer") == null) ||(httpSession.getAttribute("customerAddress") == null))
        {
            page.addObject("badEmailOrPassword", "Please login or create a user in order to access the account page");
            page.setViewName("login");
            return page;
        }
        else
        {
            page.addObject("customer",  httpSession.getAttribute("customer"));
            page.addObject("customerAddress", httpSession.getAttribute("customerAddress"));
            page.setViewName("myaccount");
            return page;
        }
    }
}