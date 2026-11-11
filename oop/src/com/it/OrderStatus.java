package com.it;

public enum OrderStatus {
    PAYMENT_PENDING("待支付"),
    PROCESSING("处理中");
    private String name;
    private OrderStatus() {}
    private OrderStatus(String name){
        this.name=name;
    }
    public String getname(){
        return this.name;
    }
}
