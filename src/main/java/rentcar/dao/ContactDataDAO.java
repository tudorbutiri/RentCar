package rentcar.dao;

import org.hibernate.classic.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import rentcar.data.ContactData;

@Repository("contactDataDAO")
@Transactional
public class ContactDataDAO {

    private static final Logger logger = LoggerFactory.getLogger(ContactDataDAO.class);

    @Autowired
    private HibernateTemplate hibernateTemplate;

    private Session getSession() {
        return hibernateTemplate.getSessionFactory().getCurrentSession();
    }

    public boolean addContactDataDAO(ContactData contactData)
    {
        try
        {
            Session session = getSession();
            session.save(contactData);
            logger.info("Message details saved successfully");
            return true;
        }
        catch (Exception ex)
        {
            return false;
        }
    }
}
