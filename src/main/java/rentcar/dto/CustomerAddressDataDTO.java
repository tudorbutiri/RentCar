package rentcar.dto;

import rentcar.data.CustomerData;

/**
 * Created by epic on 6/6/2017.
 */
public class CustomerAddressDataDTO {

    private String cityName;
    private String streetName;
    private String streetNumber;
    private String phoneNumber;
    private CustomerDataDTO customerDataDTO;


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

    public CustomerDataDTO getCustomerDataDTO() {
        return customerDataDTO;
    }

    public void setCustomerDataDTO(CustomerDataDTO customerDataDTO) {
        this.customerDataDTO = customerDataDTO;
    }
}
