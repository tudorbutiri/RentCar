package rentcar.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import rentcar.dto.CustomerAddressDataDTO;
import rentcar.dto.CustomerDataDTO;
import rentcar.facade.CustomerFullDetailsFacade;

import java.util.HashMap;
import java.util.Map;


@Controller
public class RegisterController{

    private static final Logger logger = LoggerFactory.getLogger(RegisterController.class);

    @Autowired
    CustomerFullDetailsFacade customerFullDetailsFacade;

    @RequestMapping(value="/register" , method = RequestMethod.GET)
    public ModelAndView getRegister()
    {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("customerDataString", new CustomerDataDTO());
        map.put("customerAddressDataString", new CustomerAddressDataDTO());

        return new ModelAndView("register", "customerData", map);
    }

    @RequestMapping(value="/register" , method = RequestMethod.POST)
    public void postRegister(@ModelAttribute("customerData") CustomerDataDTO customerDataDTO, CustomerAddressDataDTO customerAddressDataDTO)
    {
        customerFullDetailsFacade.addCustomerData(customerDataDTO);
        customerFullDetailsFacade.addCustomerAddressData(customerAddressDataDTO, customerDataDTO);
    }
}
