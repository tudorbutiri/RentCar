package rentcar.controllers;

import org.apache.commons.collections.map.HashedMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import rentcar.data.CustomerData;
import rentcar.dto.CustomerAddressDataDTO;
import rentcar.dto.CustomerDataDTO;
import rentcar.facade.CustomerFullDetailsFacade;
import rentcar.services.AddCustomerDataService;
import rentcar.utils.CustomerDataLoginValidator;
import rentcar.utils.LoginCredentialsValidator;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;


@Controller
public class RegisterController{

    private static final Logger logger = LoggerFactory.getLogger(RegisterController.class);

    @Autowired
    AddCustomerDataService addCustomerDataService;

    @Autowired
    CustomerFullDetailsFacade customerFullDetailsFacade;

    @Autowired
    LoginCredentialsValidator loginCredentialsValidator;

    @Autowired
    CustomerDataLoginValidator customerDataLoginValidator;

//    @InitBinder()
//    private void initBinder(WebDataBinder binder){
//        binder.setValidator(loginCredentialsValidator);
//    }

    @RequestMapping(value="/register" , method = RequestMethod.GET)
    public ModelAndView getRegister()
    {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("customerDataString", new CustomerDataDTO());
        map.put("customerAddressDataString", new CustomerAddressDataDTO());
        return new ModelAndView("register", "customerData", map);
    }

    @RequestMapping(value="/register" , method = RequestMethod.POST)
    public String postRegister(@ModelAttribute("customerData") CustomerDataDTO customerDataDTO, CustomerAddressDataDTO customerAddressDataDTO, Model model)
    {
        CustomerData customerData = addCustomerDataService.getCustomerAfterEmail(customerDataDTO.getEmail());

        if (1==1)
        {
            model.addAttribute("test", "Here I AM");

            return "register";
        }
        else
        {
            customerFullDetailsFacade.addCustomerData(customerDataDTO);
            customerFullDetailsFacade.addCustomerAddressData(customerAddressDataDTO, customerDataDTO);
            return "myaccount";
        }

    }
}
