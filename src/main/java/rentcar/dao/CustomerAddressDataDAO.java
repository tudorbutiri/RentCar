package rentcar.dao;


import org.hibernate.classic.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import rentcar.data.CustomerAddressData;
import rentcar.data.CustomerData;

@Repository("customerAddressDataDAO")
@Transactional
public class CustomerAddressDataDAO {

    private static final Logger logger = LoggerFactory.getLogger(CustomerAddressDataDAO.class);

    @Autowired
    private HibernateTemplate hibernateTemplate;

    private Session getSession() {
        return hibernateTemplate.getSessionFactory().getCurrentSession();
    }

    public void customerAddressDataDAOSave(CustomerAddressData customerAddressData)
    {
        Session session = getSession();
        session.save(customerAddressData);
        logger.info("Customer details data saved");
    }

    public void updateCustomerAddressDataDAOSave(CustomerAddressData customerAddressData)
    {
        Session session  = getSession();

//        CustomerAddressData customerAddressData1 = new CustomerAddressData();
//        customerAddressData1.setCityName(customerAddressData.getCityName());
//        customerAddressData1.setStreetName(customerAddressData.getStreetName());
//        customerAddressData1.setStreetNumber(customerAddressData.getStreetNumber());
//        customerAddressData1.setPhoneNumber(customerAddressData.getPhoneNumber());

        session.saveOrUpdate(customerAddressData);
    }
}
