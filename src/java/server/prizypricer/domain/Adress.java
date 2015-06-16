package server.prizypricer.domain;

import javax.persistence.*;

/**
 * Created by Fernando G. Morales on 6/12/15.
 */
@Entity(name = "adress")
public class Adress implements BusinessDomain {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String street;

    private Integer streetNumber;

    @ManyToOne(optional=false)
    @JoinColumn(name="id", nullable=false, updatable=false)
    private City city;

    @OneToOne(optional=false, mappedBy="adress")
    private Store store;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(Integer streetNumber) {
        this.streetNumber = streetNumber;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}
