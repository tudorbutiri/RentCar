package rentcar.facade;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rentcar.data.CustomerAddressData;
import rentcar.data.CustomerData;
import rentcar.dto.CustomerAddressDataDTO;
import rentcar.dto.CustomerDataDTO;
import rentcar.services.AddCustomerDataService;
import rentcar.services.AddCustomerAddressDataService;
import rentcar.utils.CustomerFullDetailsConverter;

@Service
public class CustomerFullDetailsFacade {

    @Autowired
    CustomerFullDetailsConverter customerFullDetailsConverter;

    @Autowired
    AddCustomerDataService addCustomerDataService;

    @Autowired
    AddCustomerAddressDataService addCustomerAddressDataService;

    public void addCustomerData(CustomerDataDTO customerDataDTO)
    {
        CustomerData customerData = customerFullDetailsConverter.convertCustomerDataDTOToData(customerDataDTO);
        addCustomerDataService.addCustomerData(customerData);
    }

    public void addCustomerAddressData(CustomerAddressDataDTO customerAddressDataDTO, CustomerDataDTO customerDataDTO)
    {
        CustomerAddressData customerAddressData = customerFullDetailsConverter.convertCustomerAddressDataDTOtoData(customerAddressDataDTO);
        addCustomerAddressDataService.addCustomerAddressData(customerAddressData, customerDataDTO.getEmail());
    }

    public void updateCustomerData(CustomerDataDTO customerDataDTO, Integer id)
    {
        CustomerData customerData = customerFullDetailsConverter.convertUpdateCustomerDataToData(customerDataDTO, id);
        addCustomerDataService.updateCustomerData(customerData);
    }

    public void updateCustomerAddressData(CustomerAddressDataDTO customerAddressDataDTO, CustomerData customerData)
    {
        CustomerAddressData customerAddressData = customerFullDetailsConverter.convertCustomerAddressDataDTOtoData(customerAddressDataDTO);
        addCustomerAddressDataService.updateCustomerAddressData(customerAddressData, customerData);
    }

    public void updateCustomerDataPassword(CustomerDataDTO customerDataDTO, CustomerData customerData)
    {
        CustomerData customerData1 = customerFullDetailsConverter.convertUpdateCustomerDataPasswordToData(customerDataDTO);
        addCustomerDataService.updateCustomerDataPass(customerData1, customerData);
    }
}
