package rentcar.dao;

import org.hibernate.Query;
import org.hibernate.classic.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import rentcar.data.CustomerData;
import rentcar.dto.CustomerDataDTO;

import java.util.List;

@Repository("customerDataDAO")
@Transactional
public class CustomerDataDAO {

    private static final Logger logger = LoggerFactory.getLogger(CustomerDataDAO.class);

    @Autowired
    private HibernateTemplate hibernateTemplate;

    private Session getSession() {
        return hibernateTemplate.getSessionFactory().getCurrentSession();
    }

    public void customerDataDAOSave(CustomerData customerData)
    {
        Session session = getSession();
        session.save(customerData);
        logger.info("Customer data saved");
    }

    public CustomerData customerDataDAOSelectAfterEmail(String email)
    {
        Session session = getSession();
        String searchQuery = "From CustomerData WHERE email = :emailCustomer";
        Query query = session.createQuery(searchQuery);
        query.setParameter("emailCustomer", email);

        CustomerData customerData = (CustomerData) query.uniqueResult();
        logger.info("Retrieved object having the customer email:" + email);
        return customerData;
    }
}


