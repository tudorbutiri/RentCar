package rentcar.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rentcar.data.ContactData;
import rentcar.data.CustomerData;
import rentcar.dto.ContactDataDTO;
import rentcar.dto.CustomerDataDTO;
import rentcar.services.ContactDataService;
import rentcar.utils.ContactDataConverter;

@Service
public class ContactDataFacade {

    @Autowired
    ContactDataConverter contactDataConverter;

    @Autowired
    ContactDataService contactDataService;

    public boolean addContactData(ContactDataDTO contactDataDTO)
    {
        ContactData contactData = contactDataConverter.convertContactDataDTOToContactData(contactDataDTO);
        return contactDataService.addContactData(contactData);
    }
}
