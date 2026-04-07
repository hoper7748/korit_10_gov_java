package study.ch20;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class OrderMain {
    public static void main(String[] args) {
        List<Order> orderList = new ArrayList<>();
        List<OrderDetail> orderDetails = new ArrayList<>();

        Product product1 = Product.builder().productName("마우스").price(150).build();

        Product product2 = Product.builder().productName("키보드").price(250).build();

        orderDetails.addAll(List.of(
                OrderDetail.builder().number(1).product(product1).stock(2).build(),
                OrderDetail.builder().number(2).product(product2).stock(2).build()

        ));

        Order order = Order.builder().orderNumber(1).orderDetails(orderDetails).orderDateTime(LocalDateTime.now()).build();

        orderList.add(order);
    }
}
