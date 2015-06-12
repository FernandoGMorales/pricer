package server.prizypricer.service;

/**
 * Created by Fernando G. Morales on 6/12/15.
 */
public class ServiceManager {

    private PriceService priceService;
    private ProductService productService;

    public PriceService getPriceService() {
        return priceService;
    }

    public void setPriceService(PriceService priceService) {
        this.priceService = priceService;
    }

    public ProductService getProductService() {
        return productService;
    }

    public void setProductService(ProductService productService) {
        this.productService = productService;
    }
}
