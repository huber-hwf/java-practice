package com.it;

public class enumtest {
    public static void main(String[] args) {
        OrderStatus o1=OrderStatus.PROCESSING;
        switch(o1) {
            case PAYMENT_PENDING:
                System.out.println("Payment is pending for this order");
                break;
            case PROCESSING:
                System.out.println("Order is processing");
                break;
        }
    }
}
