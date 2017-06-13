package rentcar.data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "AGENCY")
public class AgencyData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", updatable = false, nullable = false, length = 45)
    private Integer id;

    @Column(name = "NAME", updatable = true, nullable = false)
    private String name;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "agency",
               orphanRemoval = true, targetEntity = BranchData.class)
    private Set<BranchData> branches;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "agency",
               orphanRemoval = true, targetEntity = BookingData.class)
    private Set<BookingData> bookings;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<BranchData> getBranches() {
        return branches;
    }

    public void setBranches(Set<BranchData> branches) {
        this.branches = branches;
    }

    public Set<BookingData> getBookings() {
        return bookings;
    }

    public void setBookings(Set<BookingData> bookings) {
        this.bookings = bookings;
    }
}

