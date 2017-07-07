package rentcar.utils;

import org.springframework.stereotype.Service;
import rentcar.data.ContactData;
import rentcar.dto.ContactDataDTO;

@Service
public class ContactDataConverter {

    public ContactData convertContactDataDTOToContactData(ContactDataDTO contactDataDTO)
    {
        ContactData contactData = new ContactData();
        contactData.setName(contactDataDTO.getName());
        contactData.setEmail(contactDataDTO.getEmail());
        contactData.setPhone(contactDataDTO.getPhone());
        contactData.setSubject(contactDataDTO.getSubject());
        return contactData;
    }

}
