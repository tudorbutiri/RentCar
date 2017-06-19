package rentcar.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import rentcar.dao.CustomerDataDAO;
import rentcar.data.CustomerData;
import rentcar.dto.CustomerDataDTO;

import java.util.Locale;

@Component
public class LoginCredentialsValidator implements Validator{

    @Autowired
    ReloadableResourceBundleMessageSource messageSource;

    public boolean supports(Class<?> clazz)
    {
        return clazz.isAssignableFrom(CustomerDataDTO.class); //returns false
    }

    public void validate(Object target, Errors errors) {

        CustomerDataDTO customerDataDTO = (CustomerDataDTO) target;
        validateLoginFields(customerDataDTO, errors);
//        validatePrice(productDTO.getPrice(), errors);
    }

    public void validateLoginFields(CustomerDataDTO customerDataDTO, Errors errors)
    {
        if (customerDataDTO.getEmail()==null)
        {
            errors.rejectValue("loginData.customerDataString.email", "login.email.fail");
        }
        if (customerDataDTO.getPassword()==null)
        {
            errors.rejectValue("password", "login.password.fail");
        }
    }

    public String checkLoginData(CustomerData customerData, CustomerData customerDataDB)
    {
        if ((customerData.getEmail() != customerDataDB.getEmail()) || (customerData.getPassword() != customerDataDB.getPassword()))
        {
            return messageSource.getMessage("login.fail", null, Locale.getDefault());
        }
        else
        {
            return messageSource.getMessage("login.succesfull", null, Locale.getDefault());
        }
    }


}
