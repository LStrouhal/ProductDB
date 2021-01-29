import java.util.Objects;

public class Order {

    private int orderId;
    private Product product;

    public Order(int id, Product product) {
        this.orderId = id;
        this.product = product;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", product=" + product +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;
        Order order = (Order) o;
        return orderId == order.orderId && Objects.equals(product, order.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, product);
    }
}
