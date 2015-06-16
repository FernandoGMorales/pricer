package server.prizypricer.domain;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Fernando G. Morales on 6/15/15.
 */
@Entity(name = "worker")
public class Worker implements BusinessDomain {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToOne
    private Adress adress;

    @OneToOne
    private Email email;

    @OneToOne
    private PhoneNumber phoneNumber;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "worker")
    private Set<Price> prices;

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

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Set<Price> getPrices() {
        return prices;
    }

    public void setPrices(Set<Price> prices) {
        this.prices = prices;
    }
}
