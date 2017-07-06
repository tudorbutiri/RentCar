package rentcar.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rentcar.dao.BookingDataDAO;
import rentcar.data.BookingData;
import rentcar.data.CarData;
import rentcar.data.CarTypeData;

import java.util.List;
import java.util.Set;

@Service
public class BookingDataService {

    @Autowired
    BookingDataDAO bookingDataDAO;

    public List<CarData> getCarDataFromBookingInterval(BookingData bookingData)
    {
        return bookingDataDAO.getCarDataFromBookingInterval(bookingData);
    }

    public List<CarTypeData> getAllCarTypesData(List<CarData> excludedCarDatas)
    {
        return bookingDataDAO.getAllCarTypesData(excludedCarDatas);
    }
}
