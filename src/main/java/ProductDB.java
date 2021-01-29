import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class ProductDB {

    private HashMap <Integer, Product> mapOfProducts;

    public ProductDB(HashMap<Integer, Product> mapOfProducts) {
        this.mapOfProducts = mapOfProducts;
    }

    @Override
    public String toString() {
        return "ProductDB{" +
                "mapOfProducts=" + mapOfProducts +
                '}';
    }

    public void add (Product product) {
        mapOfProducts.put(product.getProductID(), product);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductDB productDB = (ProductDB) o;
        return Objects.equals(mapOfProducts, productDB.mapOfProducts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mapOfProducts);
    }
}
