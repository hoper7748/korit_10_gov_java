package study.ch21.ex;

import lombok.Getter;

import java.security.PrivateKey;
@Getter
class InsufficientStockException extends     Exception{
    private String productName;
    private int requested;
    private int available;

    public InsufficientStockException(String productName, int qty, int stock){
        super("("+productName+") 재고 부족: 요청=(" + qty + "), 재고=(" + stock+ ")");
        this.productName = productName;
        this.requested = qty;
        this.available = stock;
    }

}


public class Ex14 {

    public static void order(String product, int qty) throws InsufficientStockException{
        int stock =10;
        if (qty > stock)
            throw new InsufficientStockException(product, qty, stock);
    }
    public static void main(String[] args) {
        try {
            order("키보드", 11);
        }
        catch (InsufficientStockException e){
            System.out.println(e.getMessage());
            System.out.println(e.getProductName());
            System.out.println(e.getRequested());
            System.out.println(e.getAvailable());

        }
    }

}
