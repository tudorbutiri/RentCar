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
public class CustomerDataLoginValidator implements Validator{

    @Autowired
    ReloadableResourceBundleMessageSource messageSource;

    public boolean supports(Class<?> clazz)
    {
        return clazz.isAssignableFrom(CustomerDataDTO.class); //returns false
    }

    public void validate(Object target, Errors errors) {

        CustomerData customerData = (CustomerData) target;
        validateCustomerDataObject(customerData, errors);
    }

    public void validateCustomerDataObject(CustomerData customerData, Errors errors)
    {
        if (customerData.equals(null))
        {
            errors.rejectValue("email", "login.email.fail");
        }
    }
}
