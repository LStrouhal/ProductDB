import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class OrderServiceTest  {

        @Test
        public void testIfProductIsAvailible () {
            //Given
            Product product1 = new Product("apple", 1);
            Product product2 = new Product("melon", 5);
            Product product3 = new Product("pear", 8);
            Product product4 = new Product("banana", 11);
            Product product5 = new Product("tomato", 13);

            // CREATING PRODUCT DB
            ProductDB productDB = new ProductDB(new HashMap<>());
            productDB.add(product1);
            productDB.add(product2);
            productDB.add(product3);
            productDB.add(product4);

            Order order1 = new Order(1, product1);
            Order order2Mueller = new Order(2, product2);

            // CREATING ORDER DB
            OrderDB orderDB = new OrderDB(
                    new HashMap<Integer, Order>(Map.of(
                            order1.getOrderId(), order1,
                            order2Mueller.getOrderId(), order2Mueller))
            );

            //When
            OrderService orderService = new OrderService(orderDB, productDB);
            Product productMueller = new Product(order2Mueller.getProduct().getName(), order2Mueller.getProduct().getProductID());


            //Then
            assertTrue(orderService.contains(productMueller));

            // Wir möchten testen ob
            // -> wenn Herr Müller Melone bestellt
            // -> ob die Melone überhaupt in unserer ProduktDB vorkommen
            // -> ja, wir haben Melone
            // -> funktioniert
        }



    @Test
    public void testAddOrder () {
        //Given
        Product product1 = new Product("apple", 1);
        Product product2 = new Product("melon", 5);
        Product product3 = new Product("pear", 8);
        Product product4 = new Product("banana", 11);
        Product product5 = new Product("tomato", 13);

        // CREATING PRODUCT DB
        ProductDB productDB = new ProductDB(new HashMap<>());
        productDB.add(product1);
        productDB.add(product2);
        productDB.add(product3);
        productDB.add(product4);

        Order order1 = new Order(1, product1);
        Order order2Mueller = new Order(2, product2);
        Order order3 = new Order(4, product4);

        // CREATING ORDER DB
        OrderDB orderDB = new OrderDB(
                new HashMap<Integer, Order>(Map.of(
                        order1.getOrderId(), order1,
                        order2Mueller.getOrderId(), order2Mueller))
        );

        //When
        OrderService orderService = new OrderService(orderDB, productDB);
        Product productMueller = new Product(order2Mueller.getProduct().getName(), order2Mueller.getProduct().getProductID());


        //Then
        assertTrue(orderService.contains(productMueller));

        // Wir möchten testen ob
        // -> wenn Herr Müller Melone bestellt
        // -> ob die Melone überhaupt in unserer ProduktDB vorkommen
        // -> ja, wir haben Melone
        // -> funktioniert
    }





    @Test
    public void testIfProductIsNotAvailible () {
        //Given
        Product product1 = new Product("apple", 1);
        Product product2 = new Product("melon", 5);
        Product product3 = new Product("pear", 8);
        Product product4 = new Product("banana", 11);
        Product product5 = new Product("tomato", 13);

        // CREATING PRODUCT DB
        ProductDB productDB = new ProductDB(new HashMap<>());
        productDB.add(product1);
        productDB.add(product2);
        productDB.add(product3);
        productDB.add(product4);

        Order order1 = new Order(1, product1);
        Order order2Mueller = new Order(2, product5);

        // CREATING ORDER DB
        OrderDB orderDB = new OrderDB(
                new HashMap<Integer, Order>(Map.of(
                        order1.getOrderId(), order1,
                        order2Mueller.getOrderId(), order2Mueller))
        );

        //When
        OrderService orderService = new OrderService(orderDB, productDB);
        Product productMueller = new Product(order2Mueller.getProduct().getName(), order2Mueller.getProduct().getProductID());


        //Then
        assertFalse(orderService.contains(productMueller));

        // Wir möchten testen ob
        // -> wenn Herr Müller Tomaten bestellt
        // -> ob die Tomaten überhaupt in unserer ProduktDB vorkommen
        // -> wir haben keine Tomaten
        //
    }



}