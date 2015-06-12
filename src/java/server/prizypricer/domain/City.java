package server.prizypricer.domain;

/**
 * Created by Fernando G. Morales on 6/12/15.
 */
public class City implements BusinessDomain {

    private Integer id;
    private String name;
    private Country country;

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

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
