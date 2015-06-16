package server.prizypricer.domain;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Fernando G. Morales on 6/12/15.
 */
@Entity(name = "city")
public class City implements BusinessDomain {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "city")
    private Set<Adress> adresses;

    @ManyToOne(optional=false)
    @JoinColumn(name="id", nullable=false, updatable=false)
    private Country country;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public Set<Adress> getAdresses() {
        return adresses;
    }

    public void setAdresses(Set<Adress> adresses) {
        this.adresses = adresses;
    }
}
