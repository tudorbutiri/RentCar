package rentcar.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rentcar.dao.BookingDataDAO;
import rentcar.data.BookingData;

import java.util.List;
import java.util.Set;

@Service
public class BookingDataService {

    @Autowired
    BookingDataDAO bookingDataDAO;

    public Set getCarDataIDFromInterval(BookingData bookingData)
    {
        return bookingDataDAO.getCarDataFromReservationInterval(bookingData);
    }

    public Set getAvailableCarTypesFromDB(Set set)
    {
        return bookingDataDAO.getAvailableCarTypes(set);
    }

    public List getCarTypeAfterID(Set set)
    {
       return bookingDataDAO.getAllCarsAfterTypeID(set);
    }
}
