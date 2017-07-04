package rentcar.dao;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.classic.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import rentcar.data.BookingData;
import rentcar.data.CarData;
import rentcar.data.CarTypeData;
import rentcar.data.CustomerData;

import javax.persistence.TemporalType;
import java.util.*;

@Repository("bookingDataDAO")
@Transactional
public class BookingDataDAO {

    private static final Logger logger = LoggerFactory.getLogger(BookingData.class);

    @Autowired
    private HibernateTemplate hibernateTemplate;

    private Session getSession() {
        return hibernateTemplate.getSessionFactory().getCurrentSession();
    }

    public Set getCarDataFromReservationInterval(BookingData bookingData)
    {
        Session session = getSession();

        Date bookingDate = bookingData.getBookingDate();
        Date returnDate = bookingData.getReturnDate();

        String searchQuery = "select car From BookingData WHERE bookingDate = :returnDate AND returnDate = :bookingDate";
//        String searchQuery = "select car From BookingData WHERE returnDate > ?";

        Query query = session.createQuery(searchQuery);



        query.setDate("returnDate", returnDate);
        query.setDate("bookingDate", bookingDate);

        List<CarData> bookingsInTheInterval = query.list();

        logger.info("Retrieved multiple objects, BookingData, in the specified interval");

        return getCarDataIndexes(bookingsInTheInterval);
    }

    public Set getCarDataIndexes(List<CarData> carData)
    {
        ArrayList list = new ArrayList();
        for (int i = 0; i<carData.size(); i++)
        {
            list.add(carData.get(i).getId());
        }
        Set<Integer> uniqueCarDataIndexes = new HashSet<Integer>(list);

        return uniqueCarDataIndexes;
    }

    public Set getAvailableCarTypes(Set set)
    {
        Session session = getSession();
        String searchQuery = "Select carTypeData From CarData WHERE carTypeData NOT IN (" + set + ")";
        SQLQuery query = session.createSQLQuery(searchQuery);
        List<CarTypeData> listCarDataType = query.list();

        logger.info("Retrieved multiple objects, CarTypeData, in the specified interval");

        return getCarIndexes(listCarDataType);
    }

    public Set getCarIndexes(List<CarTypeData> carTypeData)
    {
        ArrayList list = new ArrayList();
        for (int i = 0; i<carTypeData.size(); i++)
        {
            list.add(carTypeData.get(i).getId());
        }
        Set<Integer> uniqueCarTypeIndexes = new HashSet<Integer>(list);

        return uniqueCarTypeIndexes;
    }

    public List getAllCarsAfterTypeID(Set set)
    {
        Session session = getSession();
        String searchQuery = "Select * From CarTypeData WHERE id = (" + set + ")";
        SQLQuery query = session.createSQLQuery(searchQuery);
        List<CarTypeData> listCarDataType = query.list();

        logger.info("Retrieved multiple objects, CarTypeData, in the specified interval");

        return listCarDataType;
    }
}
