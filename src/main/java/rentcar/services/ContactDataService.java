package rentcar.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rentcar.dao.ContactDataDAO;
import rentcar.data.ContactData;
import rentcar.dto.ContactDataDTO;

@Service
public class ContactDataService {

    @Autowired
    ContactDataDAO contactDataDAO;

    public boolean addContactData(ContactData contactData)
    {
        return contactDataDAO.addContactDataDAO(contactData);
    }
}
