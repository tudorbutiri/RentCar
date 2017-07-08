package rentcar.dto;


import org.springframework.format.annotation.DateTimeFormat;
import rentcar.data.AgencyData;
import rentcar.data.BranchData;
import rentcar.data.CarData;
import rentcar.data.CustomerData;

import java.util.Date;

public class BookingDataDTO {

    private Date bookingDate;
    private Date returnDate;
    private CustomerData customer;
    private BranchData branchData;
    private AgencyData agency;
    private CarData car;

    public BranchData getBranchData() {
        return branchData;
    }

    public void setBranchData(BranchData branchData) {
        this.branchData = branchData;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public CustomerData getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerData customer) {
        this.customer = customer;
    }

    public AgencyData getAgency() {
        return agency;
    }

    public void setAgency(AgencyData agency) {
        this.agency = agency;
    }

    public CarData getCar() {
        return car;
    }

    public void setCar(CarData car) {
        this.car = car;
    }
}
