package study.ch20;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class OrderDetail {
    // 아뇨 뚱인데요
    private int number;
    private Product product;
    private int stock;
}
