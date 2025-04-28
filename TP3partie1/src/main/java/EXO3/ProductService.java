package EXO3;

public class ProductService {
    private ProductApiClient productApiClient; // Fixed typo 'prodcutApiClient'

    public ProductService(ProductApiClient productApiClient) {
        this.productApiClient = productApiClient;
    }

    public String getProduct(String productId) { // Fixed method name
        return productApiClient.getProduct(productId);
    }
}
