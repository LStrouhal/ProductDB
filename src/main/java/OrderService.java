public class OrderService {

    private OrderDB orderDB;
    private ProductDB productDB;

    public OrderService(OrderDB orderDB, ProductDB productDB) {
        this.orderDB = orderDB;
        this.productDB = productDB;
    }

    public void addOrder(Order order){
        orderDB.getMapOfOrders().put(order.getOrderId(), order);
    }


    public boolean contains(Product product) {
        //erstmal aus der OrderDB die ID vom Produkt holen
        //dann ID aus Product ID um dann zu vergleichen
        if (productDB.getMapOfProducts().containsKey(product.getProductID())) {
            return true;
        }
        return false;

    }


}
