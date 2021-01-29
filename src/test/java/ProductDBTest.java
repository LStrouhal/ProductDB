import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductDBTest {

    @Test

    public void testAdd () {
        //Given
        Product product1 = new Product("apple", 1);
        Product product2 = new Product("melon", 5);
        Product product3 = new Product("pear", 8);
        Product product4 = new Product("banana", 11);

        ProductDB expectDBHashMap = new ProductDB(
                new HashMap<Integer, Product>(Map.of(
                        product1.getProductID(), product1,
                        product2.getProductID(), product2))
        );


        //When
        ProductDB actualHashMap = new ProductDB (new HashMap<>());
        actualHashMap.add(product1);
        actualHashMap.add(product2);

        //Then
        assertEquals(actualHashMap, expectDBHashMap);

    }

}
