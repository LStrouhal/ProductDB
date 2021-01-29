import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderDBTest {

    @Test
    public void testAdd () {
        //Given
        Product product1 = new Product("apple", 1);
        Product product2 = new Product("melon", 5);
        Product product3 = new Product("pear", 8);
        Product product4 = new Product("banana", 11);

        Order order1 = new Order(1, product1);
        Order order2 = new Order(4, product3);

        OrderDB expectOrderHashMap = new OrderDB(
                new HashMap<Integer, Order>(Map.of(
                      order1.getOrderId(), order1,
                      order2.getOrderId(), order2))
        );

        //When
        OrderDB actualHashMap = new OrderDB (new HashMap<>());
        actualHashMap.add(order1);
        actualHashMap.add(order2);

        //Then
        assertEquals(expectOrderHashMap,actualHashMap);

    }






}
