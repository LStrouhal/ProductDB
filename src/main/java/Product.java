import java.util.Objects;

public class Product {

    private String name;
    private int productID;

    public Product(String name, int productID) {
        this.name = name;
        this.productID = productID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return productID == product.productID && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, productID);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", productID=" + productID +
                '}';
    }
}
