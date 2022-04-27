package com.chenhao.test.test3;

public enum OrderStateEnum {
    //订单的状态 未付款、已付款、已发货、已收货

    UNPAIDM("未付款"){
        @Override
        public void show() {
            System.out.println("未付款");
        }
    },
    PAID("已付款"){
        @Override
        public void show() {
            System.out.println("已付款");
        }
    },
    SHIPPED("已发货"){
        @Override
        public void show() {
            System.out.println("已发货");
        }
    },
    RECEIVED("已收货"){
        @Override
        public void show() {
            System.out.println("已收货");
        }
    };

    private String code;

    public String getCode() {
        return code;
    }

    OrderStateEnum(String code) {
        this.code = code;
    }
    public abstract void show();

}
