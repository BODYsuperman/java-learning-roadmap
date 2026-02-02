package com.alex.demo;

public class Test1 {
    public static void main(String[] args) {

        double price = getTicketPrice(1000, 6, 2);
        System.out.println(price);
        double price1 = getTicketPrice(1000, 6, CabinType.FIRST);
        System.out.println(price);


    }

    public static double getTicketPrice(double price, int month, CabinType type) {
        return price * type.discount(month);
    }

    public static double getTicketPrice(double price, int month, int type) {
        // price：机票原价
        // month：月份（1-12）
        // type：舱位类型（1-头等舱，2-经济舱）

        // 旺季：5-10月
        if (month >= 5 && month <= 10) {
            if (type == 1) {
                return price * 0.9;
            } else {
                return price * 0.85;
            }
        }
        // 淡季：11-4月
        else {
            if (type == 1) {
                return price * 0.7;
            } else {
                return price * 0.65;
            }
        }
    }

}
