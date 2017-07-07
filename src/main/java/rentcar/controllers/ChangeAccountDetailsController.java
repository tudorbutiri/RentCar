package rentcar.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
    public String getAccountDetails(Model model, HttpSession httpSession)
    {
        if ((httpSession.getAttribute("customer") == null) || (httpSession.getAttribute("customerAddress") == null))
        {
            model.addAttribute("loginSuccessful", "Please login or create a user in order to access the account page");
            return "login";
        }
        else
        {
            model.addAttribute("customer",  httpSession.getAttribute("customer"));
            model.addAttribute("customerAddress", httpSession.getAttribute("customerAddress"));
            return "changeaccountdetails";
        }
    }

    @RequestMapping(value="/changeaccountdetails" , method = RequestMethod.POST)
    public String postRegister(@ModelAttribute("changeAccountDetailsModelAttribute") CustomerDataDTO customerDataDTO, CustomerAddressDataDTO customerAddressDataDTO, Model model, HttpSession httpSession) {

        CustomerData customerData = (CustomerData) httpSession.getAttribute("customer");

        CustomerData customerData1 = customerFullDetailsFacade.updateCustomerData(customerDataDTO, customerData);
        CustomerAddressData customerAddressData = customerFullDetailsFacade.updateCustomerAddressData(customerAddressDataDTO, customerData);

        httpSession.removeAttribute("customer");
        httpSession.removeAttribute("customerAddress");

        httpSession.setAttribute("customer", customerData1);
        httpSession.setAttribute("customerAddress", customerAddressData);

        model.addAttribute("loginSuccessful", "New account details have been saved!");
        return "changeaccountdetails";
    }
}
