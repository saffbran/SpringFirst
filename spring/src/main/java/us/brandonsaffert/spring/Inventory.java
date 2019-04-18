package us.brandonsaffert.spring;

public class Inventory {
    private String name;
    private int productId;
    public Inventory(String name, int productId) {
        this.name = name;
        this.productId = productId;
    }
    public String getName() {
        return name;
    }
    public int getProductId() {
        return productId;
    }
}