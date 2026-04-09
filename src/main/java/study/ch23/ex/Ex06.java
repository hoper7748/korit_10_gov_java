package study.ch23.ex;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
class Product{
    private int code;
    private String name;
    private int price;
}

public class Ex06 {

    public static void main(String[] args) {
        List<Map<String, Object>> productMaps = List.of(
                Map.of("code", 1001, "name", "노트북","price", 120000),
                Map.of("code", 1002, "name", "마우스","price", 35000),
                Map.of("code", 1003, "name", "키보드","price", 55000)
        );

        List<Product> productList = productMaps.stream().map(product -> new Product ((Integer)product.get("code"), (String) product.get("name"), (Integer)product.get("price"))).toList();

        System.out.println(productList);

    }
}
