package study.ch21.ex;

import lombok.NoArgsConstructor;

@NoArgsConstructor
class ShopException extends Exception{
    public ShopException(String message){
        super (message);
    }
}

class PaymentException extends ShopException{
    public PaymentException(String message){
        super(message);
    }

}

class OrderException extends  ShopException{
    public OrderException(String message){
        super(message);
    }
}

class InsufficientBalanceException extends PaymentException{
    public InsufficientBalanceException(String message){
        super(message);
    }
}

class CardExpiredException extends  PaymentException{
    public CardExpiredException(String message){
        super(message);
    }
}

class OutOfStockException extends OrderException{
    public OutOfStockException(String message){
        super(message);
    }
}

public class Ex16 {


    public static void main(String[] args) {
        ShopException shopException;
        PaymentException paymentException;
        OrderException orderException;
        InsufficientStockException insufficientStockException;
        CardExpiredException cardExpiredException;
        OutOfStockException outOfStockException;

        try{
            throw new OutOfStockException("재고가 부족합니다.");

        } catch (OutOfStockException e) {
//            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }
}
