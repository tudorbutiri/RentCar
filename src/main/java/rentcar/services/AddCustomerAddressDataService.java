package rentcar.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rentcar.dao.CustomerAddressDataDAO;
import rentcar.data.CustomerAddressData;

@Service
public class AddCustomerAddressDataService {

    @Autowired
    CustomerAddressDataDAO customerAddressDataDAO;

    @Autowired
    AddCustomerDataService addCustomerDataService;

    public void addCustomerAddressData (CustomerAddressData customerAddressData, String email)
    {
        customerAddressData.setCustomer(addCustomerDataService.getCustomerAfterEmail(email));
        customerAddressDataDAO.customerAddressDataDAOSave(customerAddressData);
    }

    public void updateCustomerAddressData (CustomerAddressData customerAddressData)

}
