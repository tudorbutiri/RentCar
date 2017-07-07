package rentcar.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import rentcar.data.CustomerAddressData;
import rentcar.data.CustomerData;
import rentcar.dto.ContactDataDTO;
import rentcar.facade.ContactDataFacade;

import javax.servlet.http.HttpSession;

@Controller
public class ContactController
{
    @Autowired
    ContactDataFacade contactDataFacade;

    @RequestMapping(value="/contact" , method = RequestMethod.GET)
    public String getContact(Model model, HttpSession httpSession)
    {
        if ((httpSession.getAttribute("customer") == null) ||(httpSession.getAttribute("customerAddress") == null))
        {
            return "contact";
        }
        else
        {
            model.addAttribute("customer",  (CustomerData) httpSession.getAttribute("customer"));
            model.addAttribute("customerAddress", (CustomerAddressData) httpSession.getAttribute("customerAddress"));
            return "contact";
        }
    }

    @RequestMapping(value="/contact" , method = RequestMethod.POST)
    public String postContact(@ModelAttribute("myContactModelAttribute") ContactDataDTO contactDataDTO, Model model)
    {
        if (contactDataFacade.addContactData(contactDataDTO))
        {
            model.addAttribute("loginSuccessful", "Message has been sent!");
            return "contact";
        }
        else
        {
            model.addAttribute("loginSuccessful", "Error while sending message! Please try again later!");
            return "contact";
        }
    }
}
