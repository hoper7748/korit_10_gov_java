package study.ch20;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
public class Order {
    // 주문은 토끼입니까?
    private int orderNumber;
    private List<OrderDetail> orderDetails;
    private LocalDateTime orderDateTime;
}
