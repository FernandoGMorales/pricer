package server.prizypricer.domain;

import javax.persistence.*;

/**
 * Created by Fernando G. Morales on 6/12/15.
 */
@Entity
@Table(name="product")
@TableGenerator(
        name = "barcode",
        table = "barcode_table",
        pkColumnName = "GEN_NAME",
        valueColumnName = "GEN_VAL",
        pkColumnValue = "id",
        initialValue = 10000,
        allocationSize = 100)
public class Product implements BusinessDomain {

    @Id
    @GeneratedValue(strategy=GenerationType.TABLE, generator="barcode")
    private Long id;
    private String name;
    private String description;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object product) {
        if(product==this) return true;
        if(!(product instanceof Product)) return false;
        return this.name.equals(((Product)product).getName());
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }

}
