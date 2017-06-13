package rentcar.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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


    public String checkCustomerLoginData(CustomerDataDTO customerDataDTO)
    {
        CustomerData customerData = customerFullDetailsConverter.convertCustomerDataDTOToData(customerDataDTO);
        return logInUserService.checkLoginRegistrationCredentials(customerData);
    }

}
