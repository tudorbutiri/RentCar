package rentcar.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.stereotype.Service;
import rentcar.data.CustomerData;

import java.util.Locale;

@Service
public class CheckLoginCredentials {

    @Autowired
    ReloadableResourceBundleMessageSource messageSource;

    public String checkLoginData(CustomerData customerData, CustomerData customerDataDB)
    {
        if ((customerData.getEmail() != customerDataDB.getEmail()) || (customerData.getPassword() != customerDataDB.getPassword()))
        {
            return messageSource.getMessage("login.succesfull", null, Locale.getDefault());
        }
        else
        {
            return messageSource.getMessage("login.fail", null, Locale.getDefault());
        }
    }

}
