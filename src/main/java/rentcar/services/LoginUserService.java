package rentcar.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import rentcar.data.CustomerData;
import rentcar.dto.CustomerDataDTO;
import rentcar.utils.LoginCredentialsValidator;

@Service
public class LoginUserService {

    @Autowired
    AddCustomerDataService addCustomerDataService;

    @Autowired
    LoginCredentialsValidator checkLoginCredentials;

    public boolean checkLoginRegistrationCredentials(CustomerDataDTO customerDataDTO, CustomerData customerData, Model model)
    {
        if (customerData == null || customerData.getEmail() == null || customerData.getPassword() == null)
        {
            model.addAttribute("badEmailOrPassword", "Email or Password are incorrect!");
            return false;
        }
        else if ((customerData.getEmail().equals(customerDataDTO.getEmail())) && (customerData.getPassword().equals(customerDataDTO.getPassword())))
        {
            model.addAttribute("badEmailOrPassword", "Login successful");
            return true;
        }
        else
        {
            model.addAttribute("badEmailOrPassword", "Email or Password are incorrect!");
            return false;
        }
    }

    public boolean checkEmailForgotPassword(CustomerData customerData, Model model)
    {
        if (customerData == null)
        {
            model.addAttribute("badEmailOrPassword", "Email address is not valid!");
            return false;
        }
        else return true;
    }
}
