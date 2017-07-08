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
import rentcar.dto.ContactDataDTO;
import rentcar.facade.ContactDataFacade;

import javax.servlet.http.HttpSession;

@Controller
public class ContactController
{
    @Autowired
    ContactDataFacade contactDataFacade;

    @RequestMapping(value="/contact" , method = RequestMethod.GET)
    public ModelAndView getContact(Model model, HttpSession httpSession)
    {
        ModelAndView page = new ModelAndView();
        if ((httpSession.getAttribute("customer") == null) ||(httpSession.getAttribute("customerAddress") == null))
        {
            page.setViewName("contact");
            return page;
        }
        else
        {
            page.addObject("customer",  httpSession.getAttribute("customer"));
            page.addObject("customerAddress", (CustomerAddressData) httpSession.getAttribute("customerAddress"));
            page.setViewName("contact");
            return page;
        }
    }

    @RequestMapping(value="/contact" , method = RequestMethod.POST)
    public ModelAndView postContact(@ModelAttribute("myContactModelAttribute") ContactDataDTO contactDataDTO)
    {
        ModelAndView page = new ModelAndView();
        if (contactDataFacade.addContactData(contactDataDTO))
        {
            page.addObject("loginSuccessful", "Message has been sent!");
            page.setViewName("contact");
            return page;
        }
        else
        {
            page.addObject("loginSuccessful", "Error while sending message! Please try again later!");
            page.setViewName("contact");
            return page;
        }
    }
}
