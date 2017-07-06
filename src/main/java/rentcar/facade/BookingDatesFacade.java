package rentcar.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rentcar.data.BookingData;
import rentcar.data.CarData;
import rentcar.data.CarTypeData;
import rentcar.dto.BookingDataDTO;
import rentcar.services.BookingDataService;
import rentcar.utils.BookingDatesConverter;

import java.util.List;
import java.util.Set;

@Service
public class BookingDatesFacade {

    @Autowired
    BookingDatesConverter bookingDatesConverter;

    @Autowired
    BookingDataService bookingDataService;

    public List<CarData> getCarDataFromBookingInterval(BookingDataDTO bookingDataDTO)
    {
        BookingData bookingData = bookingDatesConverter.convertBookingDataDTOtoData(bookingDataDTO);
        return bookingDataService.getCarDataFromBookingInterval(bookingData);
    }

    public List<CarTypeData> getAllCarTypesData(List<CarData> excludedCarDatas)
    {
        return bookingDataService.getAllCarTypesData(excludedCarDatas);
    }
}
