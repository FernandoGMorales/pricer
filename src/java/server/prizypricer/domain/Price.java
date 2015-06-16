package server.prizypricer.domain;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by Fernando G. Morales on 6/12/15.
 */
@Entity(name = "price")
public class Price implements BusinessDomain {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional=false)
    @JoinColumn(name="id", nullable=false, updatable=false)
    private Product product;

    @ManyToOne(optional=false)
    @JoinColumn(name="id", nullable=false, updatable=false)
    private Store store;

    private Date date;

    private BigDecimal price;

    @ManyToOne(optional=false)
    @JoinColumn(name="id", nullable=false, updatable=false)
    private Worker worker;

    protected Price() {}

    public Price(Product product, Store store, Date date, BigDecimal price, Worker worker) {
        this.product = product;
        this.store = store;
        this.date = date;
        this.price = price;
        this.worker = worker;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Worker getWorker() {
        return worker;
    }

    public void setWorker(Worker worker) {
        this.worker = worker;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
