import java.util.HashMap;
import java.util.Objects;

public class OrderDB {

    private HashMap<Integer, Order> mapOfOrders;

    public OrderDB(HashMap<Integer, Order> mapOfOrders) {
        this.mapOfOrders = mapOfOrders;
    }

    public HashMap<Integer, Order> getMapOfOrders() {
        return mapOfOrders;
    }

    public void add (Order order) {
        mapOfOrders.put(order.getOrderId(), order);
    }


    @Override
    public String toString() {
        return "OrderDB{" +
                "mapOfOrders=" + mapOfOrders +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OrderDB)) return false;
        OrderDB orderDB = (OrderDB) o;
        return Objects.equals(mapOfOrders, orderDB.mapOfOrders);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mapOfOrders);
    }

}
