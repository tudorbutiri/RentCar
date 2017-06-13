package rentcar.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rentcar.dao.CustomerAddressDataDAO;
import rentcar.dao.CustomerDataDAO;
import rentcar.data.CustomerAddressData;
import rentcar.data.CustomerData;
import rentcar.dto.CustomerDataDTO;

@Service
public class AddCustomerDataService {

    @Autowired
    CustomerDataDAO customerDataDAO;

    public void addCustomerData(CustomerData customerData)
    {
        customerDataDAO.customerDataDAOSave(customerData);
    }

    public CustomerData getCustomerAfterEmail(String email)
    {
        return customerDataDAO.customerDataDAOSelectAfterEmail(email);
    }

}
