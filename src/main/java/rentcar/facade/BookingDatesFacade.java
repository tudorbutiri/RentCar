package rentcar.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rentcar.data.BookingData;
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

    public Set getAllCarDataIDFromBookingInterval(BookingDataDTO bookingDataDTO)
    {
        BookingData bookingData = bookingDatesConverter.convertBookingDataDTOtoData(bookingDataDTO);
        return bookingDataService.getCarDataIDFromInterval(bookingData);
    }

    public Set getAllCarTypesWithIndexes(Set set)
    {
        return bookingDataService.getAvailableCarTypesFromDB(set);
    }

    public List getCarTypeAfterCarTypeId(Set set)
    {
        return bookingDataService.getCarTypeAfterID(set);
    }

}
