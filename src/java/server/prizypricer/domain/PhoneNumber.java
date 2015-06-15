package server.prizypricer.domain;

import javax.persistence.*;

/**
 * Created by Fernando G. Morales on 6/12/15.
 */
@Entity
public class PhoneNumber {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String countryPrefix;
    private String cityPrefix;
    private String phoneNumber;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCountryPrefix() {
        return countryPrefix;
    }

    public void setCountryPrefix(String countryPrefix) {
        this.countryPrefix = countryPrefix;
    }

    public String getCityPrefix() {
        return cityPrefix;
    }

    public void setCityPrefix(String cityPrefix) {
        this.cityPrefix = cityPrefix;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
