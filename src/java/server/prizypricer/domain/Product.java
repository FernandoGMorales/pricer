package server.prizypricer.domain;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Fernando G. Morales on 6/12/15.
 */
@Entity
@Table(name="product")
@TableGenerator(
        name = "product_id_gen",
        table = "product_id_table",
        pkColumnName = "GEN_NAME",
        valueColumnName = "GEN_VAL",
        pkColumnValue = "id",
        initialValue = 10000,
        allocationSize = 100,
        uniqueConstraints = {@UniqueConstraint(columnNames = "barcode")})
public class Product implements BusinessDomain {

    @Id
    @GeneratedValue(strategy=GenerationType.TABLE, generator="product_id_gen")
    private Long id;

    private Long barcode;

    private String name;

    private String notes;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "product")
    private Set<Price> price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBarcode() {
        return barcode;
    }

    public void setBarcode(Long barcode) {
        this.barcode = barcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Set<Price> getPrice() {
        return price;
    }

    public void setPrice(Set<Price> price) {
        this.price = price;
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
