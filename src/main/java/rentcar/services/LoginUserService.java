package rentcar.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rentcar.data.CustomerData;
import rentcar.utils.CheckLoginCredentials;

@Service
public class LoginUserService {


    @Autowired
    AddCustomerDataService addCustomerDataService;

    @Autowired
    CheckLoginCredentials checkLoginCredentials;

    public String checkLoginRegistrationCredentials(CustomerData customerData)
    {
        CustomerData customerDataDB = addCustomerDataService.getCustomerAfterEmail(customerData.getEmail());
        return checkLoginCredentials.checkLoginData(customerData, customerDataDB);
    }

}
