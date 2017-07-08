package rentcar.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import rentcar.data.CustomerData;
import rentcar.dto.CustomerDataDTO;
import rentcar.utils.LoginUserValidator;

@Service
public class LoginUserFacade {

    @Autowired
    LoginUserValidator logInUserValidator;

    public boolean checkCustomerLoginData(CustomerDataDTO customerDataDTO, CustomerData customerData)
    {
        return logInUserValidator.checkLoginRegistrationCredentials(customerDataDTO, customerData);
    }

    public boolean checkCustomerEmailData (CustomerData customerData)
    {
        return logInUserValidator.checkEmailForgotPassword(customerData);
    }

}
