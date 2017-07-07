package rentcar.data;

import javax.persistence.*;

@Entity
@Table(name="BRANCH")
public class BranchData {

    @Id
    @GeneratedValue
    @Column(name = "ID", updatable = false, nullable = false)
    private Integer id;

    @Column(name = "NAME", updatable = true, nullable = false, length = 45)
    private String name;

    @ManyToOne(optional = false, targetEntity = AgencyData.class)
    @JoinColumn(name = "AGENCY_ID", updatable = false, nullable = false,
            referencedColumnName = "ID")
    private AgencyData agency;

    @Column(name = "CITY_NAME", updatable = false, nullable = false,
            length = 45)
    private String cityName;

    @Column(name = "STREET_NAME", updatable = true, nullable = false,
            length = 45)
    private String streetName;

    @Column(name = "STREET_NUMBER", updatable = true, nullable = false,
            length = 5)
    private String streetNumber;

    @Column(name = "POSTAL_CODE", updatable = true, nullable = false,
            length = 10)
    private String postalCode;

    @Column(name = "PHONE_NUMBER", updatable = true, nullable = false,
            length = 45)
    private String phoneNumber;

    @Column(name = "LATITUDE", updatable = true, nullable = false,
            length=45)
    private Double latitude;

    @Column(name = "LONGITUDE", updatable = true, nullable = false,
            length=45)
    private Double longitude;

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

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

    public AgencyData getAgency() {
        return agency;
    }

    public void setAgency(AgencyData agency) {
        this.agency = agency;
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

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
