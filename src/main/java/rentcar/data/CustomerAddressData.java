package rentcar.data;

import javax.persistence.*;

/**
 * Created by Epic on 1/23/2017.
 */

@Entity
@Table(name = "CUSTOMER_ADDRESS")
public class CustomerAddressData {

    @Id
    @Column(name = "ID", updatable = false, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "CITY_NAME", updatable = true, nullable = false, length = 45)
    private String cityName;

    @Column(name = "STREET_NAME", updatable = true, nullable = false, length = 45)
    private String streetName;

    @Column(name = "STREET_NUMBER", updatable = true, nullable = false, length = 5)
    private String streetNumber;

    @Column(name = "PHONE_NUMBER", updatable = true, nullable = false, length = 45)
    private String phoneNumber;

    @ManyToOne(optional = false, targetEntity = CustomerData.class)
    @JoinColumn(name = "CUSTOMER_ID", updatable = false, nullable = false,
            referencedColumnName = "ID")
    private CustomerData customer;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public CustomerData getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerData customer) {
        this.customer = customer;
    }
}
