package study.ch20;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Product {
    private String productName;
    private int price;
}
