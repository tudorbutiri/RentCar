package rentcar.dao;

import org.hibernate.Query;
import org.hibernate.classic.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
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

    public void customerUpdateDataDAOSave(CustomerData customerData)
    {
        Session session  = getSession();

//        CustomerData customerData1 = getCustomerData(customerData.getId());
//        customerData1.setCompanyName(customerData.getCompanyName());
//        customerData1.setEmail(customerData.getEmail());
//        customerData1.setFirstName(customerData.getFirstName());
//        customerData1.setLastName(customerData.getLastName());
//        customerData1.setRegisterDate(customerData.getRegisterDate());

        session.saveOrUpdate(customerData);
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
    }

    public CustomerData getCustomerData(Integer id)
    {
        Session session  = getSession();
        String searchQuery = "from CustomerData p where p.id = :product_id";
        Query query = session.createQuery(searchQuery);
        query.setParameter("product_id", id);

        CustomerData singleResult = (CustomerData) query.uniqueResult();
        return singleResult;
    }

    public CustomerData customerDataDAOSelectAfterEmail(String email)
    {
        Session session = getSession();
        String searchQuery = "From CustomerData WHERE email = :emailCustomer";
        Query query = session.createQuery(searchQuery);
        query.setParameter("emailCustomer", email);

        CustomerData customerData = (CustomerData) query.uniqueResult();
        logger.info("Retrieved object, Customer Data, having the customer email:" + email);
        return customerData;
    }

    public CustomerAddressData customerAddressDataDAOSelectAfterId(Integer id)
    {
        Session session = getSession();
        String searchQuery = "From CustomerAddressData WHERE id = :idCustomerAddressData";
        Query query = session.createQuery(searchQuery);
        query.setParameter("idCustomerAddressData", id);

        CustomerAddressData customerAddressData = (CustomerAddressData) query.uniqueResult();
        logger.info("Retrieved object, Customer Address Data, after the customer id");
        return customerAddressData;
    }
}


