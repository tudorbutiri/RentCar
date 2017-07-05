package rentcar.data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "BOOKING")
public class BookingData
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BOOKING_NUMBER", updatable = false, nullable = false)
    private Integer bookingNumber;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "BOOKING_DATE", updatable = true, nullable = false)
    private Date bookingDate;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "RETURN_DATE", updatable = true, nullable = false)
    private Date returnDate;

    @ManyToOne(optional = false, targetEntity = CustomerData.class)
    @JoinColumn(name = "CUSTOMER_ID", updatable = false, nullable = false,
                referencedColumnName = "ID")
    private CustomerData customer;

    @ManyToOne(optional = false, targetEntity = AgencyData.class)
    @JoinColumn(name = "AGENCY_ID", updatable = false, nullable = false,
                referencedColumnName = "ID")
    private AgencyData agency;

    @ManyToOne(optional = false, targetEntity = CarData.class)
    @JoinColumn(name = "CAR_ID", updatable = false, nullable = false,
                referencedColumnName = "ID")
    private CarData car;

    public Integer getBookingNumber() {
        return bookingNumber;
    }

    public void setBookingNumber(Integer bookingNumber) {
        this.bookingNumber = bookingNumber;
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
