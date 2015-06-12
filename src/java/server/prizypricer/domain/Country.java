package server.prizypricer.domain;

/**
 * Created by Fernando G. Morales on 6/12/15.
 */
public class Country implements BusinessDomain {

    private Integer id;
    private String name;

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
}
