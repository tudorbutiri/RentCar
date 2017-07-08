package rentcar.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import rentcar.data.CustomerData;
import rentcar.dto.CustomerDataDTO;
import rentcar.utils.LoginCredentialsValidator;

@Service
public class LoginUserValidator {

    public boolean checkLoginRegistrationCredentials(CustomerDataDTO customerDataDTO, CustomerData customerData)
    {
        if (customerData == null || customerData.getEmail() == null || customerData.getPassword() == null)
        {
            return false;
        }
        else
        {
            return (customerData.getEmail().equals(customerDataDTO.getEmail())) && (customerData.getPassword().equals(customerDataDTO.getPassword()));
        }
    }

    public boolean checkEmailForgotPassword(CustomerData customerData)
    {
        return customerData != null;
    }
}
