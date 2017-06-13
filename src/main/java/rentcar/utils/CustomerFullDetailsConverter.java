package rentcar.utils;

import org.springframework.stereotype.Service;
import rentcar.data.CustomerAddressData;
import rentcar.data.CustomerData;
import rentcar.dto.CustomerAddressDataDTO;
import rentcar.dto.CustomerDataDTO;

import java.time.LocalDateTime;
import java.util.Date;

@Service
public class CustomerFullDetailsConverter {

    public CustomerData convertCustomerDataDTOToData (CustomerDataDTO customerDataDTO)
    {
        CustomerData customerData = new CustomerData();
        customerData.setCompanyName(customerDataDTO.getCompanyName());
        customerData.setFirstName(customerDataDTO.getFirstName());
        customerData.setLastName(customerDataDTO.getLastName());
        customerData.setEmail(customerDataDTO.getEmail());
        customerData.setPassword(customerDataDTO.getPassword());

        Date date = new Date();

        customerData.setRegisterDate(date);

        return customerData;
    }

    public CustomerAddressData convertCustomerAddressDataDTOtoData (CustomerAddressDataDTO customerAddressDataDTO)
    {
        CustomerAddressData customerAddressData = new CustomerAddressData();
        customerAddressData.setCityName(customerAddressDataDTO.getCityName());
        customerAddressData.setStreetName(customerAddressDataDTO.getStreetName());
        customerAddressData.setStreetNumber(customerAddressDataDTO.getStreetNumber());
        customerAddressData.setPhoneNumber(customerAddressDataDTO.getPhoneNumber());

        return customerAddressData;
    }
}
