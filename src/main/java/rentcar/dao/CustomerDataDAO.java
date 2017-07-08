package rentcar.dao;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.classic.Session;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import rentcar.data.BookingData;
import rentcar.data.CarData;
import rentcar.data.CustomerAddressData;
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

    public CustomerData customerUpdateDataDAOSave(CustomerData customerData)
    {
        Session session  = getSession();
        session.saveOrUpdate(customerData);
        logger.info("Customer data saved");
        return customerData;
    }

    public void customerDataUpdatePasswordDAOSave(CustomerData customerData1, CustomerData customerData)
    {
        Session session  = getSession();
        customerData1.setId(customerData.getId());
        customerData1.setCompanyName(customerData.getCompanyName());
        customerData1.setEmail(customerData.getEmail());
        customerData1.setFirstName(customerData.getFirstName());
        customerData1.setLastName(customerData.getLastName());
        session.saveOrUpdate(customerData1);
        logger.info("Updated password");
    }

    public CustomerData customerDataDAOSelectAfterEmail(String email)
    {
        Session session = getSession();
        Criteria criteria = session.createCriteria(CustomerData.class);
        criteria.add(Restrictions.eq("email", email));
        CustomerData customerData = (CustomerData) criteria.uniqueResult();
        logger.info("Retrieved a unique CustomerData with email:" + email);
        return customerData;
    }

    public CustomerAddressData customerAddressDataDAOSelectAfterId(Integer id)
    {
        Session session = getSession();
        Criteria criteria = session.createCriteria(CustomerAddressData.class);
        criteria.add(Restrictions.eq("customer.id", id));
        CustomerAddressData customerAddressData = (CustomerAddressData) criteria.uniqueResult();
        logger.info("Retrieved a unique CustomerAddress with foreign key, customer.id:" + id);
        return customerAddressData;
    }
}


