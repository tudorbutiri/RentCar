package rentcar.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import rentcar.data.CustomerAddressData;
import rentcar.data.CustomerData;
import rentcar.dto.CustomerAddressDataDTO;
import rentcar.dto.CustomerDataDTO;
import rentcar.facade.CustomerFullDetailsFacade;

import javax.servlet.http.HttpSession;

@Controller
public class ChangeAccountDetailsController {

    @Autowired
    CustomerFullDetailsFacade customerFullDetailsFacade;

    @RequestMapping(value="/changeaccountdetails" , method = RequestMethod.GET)
    public ModelAndView getAccountDetails(HttpSession httpSession)
    {
        ModelAndView page = new ModelAndView();

        if ((httpSession.getAttribute("customer") == null) || (httpSession.getAttribute("customerAddress") == null))
        {
            page.addObject("loginSuccessful", "Please login or create a user in order to access the account page");
            page.setViewName("login");
            return page;
        }
        else
        {
            page.addObject("customer",  httpSession.getAttribute("customer"));
            page.addObject("customerAddress", httpSession.getAttribute("customerAddress"));
            page.setViewName("changeaccountdetails");
            return page;
        }
    }

    @RequestMapping(value="/changeaccountdetails" , method = RequestMethod.POST)
    public ModelAndView postRegister(@ModelAttribute("changeAccountDetailsModelAttribute") CustomerDataDTO customerDataDTO, CustomerAddressDataDTO customerAddressDataDTO, HttpSession httpSession) {

        ModelAndView page = new ModelAndView();

        CustomerData customerData = (CustomerData) httpSession.getAttribute("customer");

        CustomerData customerData1 = customerFullDetailsFacade.updateCustomerData(customerDataDTO, customerData);
        CustomerAddressData customerAddressData = customerFullDetailsFacade.updateCustomerAddressData(customerAddressDataDTO, customerData);

        httpSession.removeAttribute("customer");
        httpSession.removeAttribute("customerAddress");

        httpSession.setAttribute("customer", customerData1);
        httpSession.setAttribute("customerAddress", customerAddressData);

        page.addObject("loginSuccessful", "New account details have been saved!");
        page.setViewName("changeaccountdetails");
        return page;
    }
}