package server.prizypricer.domain;

/**
 * Created by Fernando G. Morales on 6/12/15.
 */
public class Product implements BusinessDomain {

    private Integer id;
    private String name;
    private String description;
    private Price price;
    private String barcode;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    @Override
    public boolean equals(Object product) {
        if(product==this) return true;
        if(!(product instanceof Product)) return false;
        return this.barcode.equals(((Product)product).getBarcode())
                && this.name.equals(((Product)product).getName());
    }

    @Override
    public int hashCode() {
        return this.barcode.hashCode() + this.name.hashCode();
    }

}
