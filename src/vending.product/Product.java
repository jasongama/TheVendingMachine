package vending.product;

public class Product {
    private int getProduct = 0;

    public String description() {
        return "This is a product";
    }

    public void setGetStock(Product product) {
        this.getProduct = 0;
    }

    public int getStock() {
        return getProduct;
    }

}
