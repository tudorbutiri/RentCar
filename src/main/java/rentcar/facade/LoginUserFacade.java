package rentcar.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import rentcar.data.CustomerData;
import rentcar.dto.CustomerDataDTO;
import rentcar.services.LoginUserService;
import rentcar.utils.CustomerFullDetailsConverter;

@Service
public class LoginUserFacade {

    @Autowired
    LoginUserService logInUserService;

    @Autowired
    CustomerFullDetailsConverter customerFullDetailsConverter;


    public String checkCustomerLoginData(CustomerDataDTO customerDataDTO, CustomerData customerData, Model model)
    {
        return logInUserService.checkLoginRegistrationCredentials(customerDataDTO, customerData, model);
    }

}
