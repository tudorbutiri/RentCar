package rentcar.data;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "CAR")
public class CarData {

    @Id
    @GeneratedValue
    @Column(name = "ID", updatable = false, nullable = false)
    private Integer id;

    @Column(name = "BASE_PRICE_PER_DAY", updatable = true, nullable = false)
    private Float basePricePerDay;

    @Column(name = "DATE_OF_MANUFACTURING", updatable = false, nullable = false)
    private Date dateOfManufacturing;

    @Column(name = "REGISTRATION_NUMBER", updatable = false, nullable = false)
    private String registrationNumber;

    @ManyToOne(optional = false, targetEntity = CarTypeData.class)
    @JoinColumn(name = "CAR_TYPE_ID", updatable = false, nullable = false,
            referencedColumnName = "ID")
    private CarTypeData carTypeData;

    @ManyToOne(optional = false, targetEntity = BranchData.class)
    @JoinColumn(name = "BRANCH_ID", updatable = true, nullable = false,
            referencedColumnName = "ID")
    private BranchData branch;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "car", targetEntity =
            BookingData.class)
    private Set<BookingData> bookings;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getBasePricePerDay() {
        return basePricePerDay;
    }

    public void setBasePricePerDay(Float basePricePerDay) {
        this.basePricePerDay = basePricePerDay;
    }

    public Date getDateOfManufacturing() {
        return dateOfManufacturing;
    }

    public void setDateOfManufacturing(Date dateOfManufacturing) {
        this.dateOfManufacturing = dateOfManufacturing;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public CarTypeData getCarTypeData() {
        return carTypeData;
    }

    public void setCarTypeData(CarTypeData carTypeData) {
        this.carTypeData = carTypeData;
    }

    public BranchData getBranch() {
        return branch;
    }

    public void setBranch(BranchData branch) {
        this.branch = branch;
    }

    public Set<BookingData> getBookings() {
        return bookings;
    }

    public void setBookings(Set<BookingData> bookings) {
        this.bookings = bookings;
    }
}
