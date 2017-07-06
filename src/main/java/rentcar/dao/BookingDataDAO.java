package rentcar.dao;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
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

    public List<CarData> getCarDataFromBookingInterval(BookingData bookingData) {
        Session session = getSession();
        Criteria criteria = session.createCriteria(BookingData.class);
        criteria.add(Restrictions.lt("bookingDate", bookingData.getReturnDate()));
        criteria.add(Restrictions.gt("returnDate", bookingData.getBookingDate()));
        criteria.setProjection(Projections.property("car"));
        List<CarData> bookingsInTheInterval = criteria.list();

        logger.info("Retrieved multiple objects, BookingData, in the specified interval");

        return bookingsInTheInterval;
    }

//    public List<CarTypeData> getAllCarTypesData(List<CarData> excludedCarDatas) {
//        List<Integer> ids = new ArrayList<Integer>();
//        for(CarData excludedCarData : excludedCarDatas) {
//            ids.add(excludedCarData.getId());
//        }
//        Criteria criteria = getSession().createCriteria(CarData.class);
//        if(excludedCarDatas != null && excludedCarDatas.size() > 0){
//            criteria.add(Restrictions.not(Restrictions.in("id", ids)));
//        }
//        criteria.setProjection(Projections.property("carTypeData"));
//        List<CarTypeData> carTypeDatas = criteria.list();
//
//        logger.info("Retrieved multiple objects, CarTypeData, in the specified interval");
//
//        return carTypeDatas;
//    }

    public List<CarTypeData> getAllCarTypesData(List<CarData> excludedCarDatas) {
        List<Integer> ids = new ArrayList<Integer>();
        for(CarData excludedCarData : excludedCarDatas)
        {
            ids.add(excludedCarData.getCarTypeData().getId());
        }
        //get all unique values from carTypeData;
        Set<Integer> uniqueCarTypeID = new HashSet<Integer>(ids);
        Criteria criteria = getSession().createCriteria(CarTypeData.class);
        if(excludedCarDatas != null && excludedCarDatas.size() > 0)
        {
            criteria.add(Restrictions.not(Restrictions.in("id", uniqueCarTypeID)));
        }
        List<CarTypeData> carTypeDatas = criteria.list();
        logger.info("Retrieved multiple objects, CarTypeData, in the specified interval");
        return carTypeDatas;
    }
}
