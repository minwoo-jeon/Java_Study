package ref.ex;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[3];
        orders[0] = createOrder("두부", 2000, 2);
        orders[1] = createOrder("김치", 5000, 1);
        orders[2] = createOrder("콜라", 1500, 2);

        printOrders(orders);
        int totalAmout = getTotalAmout(orders);
        System.out.println("총가격 = " + totalAmout);

    }

    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder product = new ProductOrder();
        product.productName = productName;
        product.price = price;
        product.quantity = quantity;
        return product;
    }

    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명:" + order.productName + "가격:" + order.price + "수량:" + order.quantity);
        }

    }

    static int getTotalAmout(ProductOrder[] orders) {
        int totalAmout = 0;
        for (ProductOrder order : orders) {
            totalAmout += order.price * order.quantity;
        }
        return totalAmout;


    }
}
