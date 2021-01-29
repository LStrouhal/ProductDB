import java.util.HashMap;

public class MainApp {

    public static void main(String[] args) {

        Product product1 = new Product("apple", 1);
        Product product2 = new Product("melon", 5);
        Product product3 = new Product("pear", 8);
        Product product4 = new Product("banana", 11);

        Order order1 = new Order(1, product1);
        Order order2 = new Order(4, product3);

        OrderDB orderDB = new OrderDB(new HashMap<>());
        orderDB.add(order1);
        orderDB.add(order2);

        ProductDB productDB = new ProductDB(new HashMap<>());
        productDB.add(product1);
        productDB.add(product2);
        productDB.add(product3);
        productDB.add(product4);

        System.out.println(productDB.toString());
        System.out.println(orderDB.toString());

        OrderService.addOrder(order2);


    }


}
