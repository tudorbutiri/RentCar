package rentcar.data;


import javafx.scene.control.DatePicker;
import org.hibernate.annotations.GenerationTime;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Set;


@Entity
@Table(name = "CUSTOMER")
public final class CustomerData implements Serializable {

    @Id
    @Column(name = "ID", updatable = false, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "COMPANY_NAME", updatable = true, nullable = true)
    private String companyName;

    @Column(name = "FIRST_NAME", updatable = true, nullable = true, length = 45)
    private String firstName;

    @Column(name = "LAST_NAME", updatable = true, nullable = true, length = 45)
    private String lastName;

    @Column(name = "EMAIL", updatable = true, nullable = false, length = 45)
    private String email;

    @Column(name = "PASSWORD", updatable = true, nullable = false, length = 45)
    private String password;

    @Column(name = "REGISTER_DATE", updatable = false, nullable = false)
    private Date registerDate;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "customer", orphanRemoval
            = true, targetEntity = CustomerAddressData.class)
    private Set<CustomerAddressData> customerAddresses;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "customer", orphanRemoval
            = true, targetEntity = BookingData.class)
    private Set<BookingData> bookings;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<CustomerAddressData> getCustomerAddresses() {
        return customerAddresses;
    }

    public void setCustomerAddresses(Set<CustomerAddressData> customerAddresses) {
        this.customerAddresses = customerAddresses;
    }

    public Set<BookingData> getBookings() {
        return bookings;
    }

    public void setBookings(Set<BookingData> bookings) {
        this.bookings = bookings;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }
}
