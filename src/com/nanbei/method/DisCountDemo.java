package com.nanbei.method;

import java.util.Scanner;

public class DisCountDemo {
    /*
    定义一个方法，根据商品总价，计算出对应的折扣并输出。折扣信息如下：
    1） 总价<100，不打折
    2） 总价在100到199之间，打9.5折
    3） 总价在200以上，打8.5折
     */
    static double moneys = 0;

    public double daZhe(double jiaGe) {
        if (jiaGe > 200) {
            System.out.println("本商品8.5折");
            moneys = jiaGe * 0.95;
        } else if (jiaGe >= 100 & jiaGe < 200) {
            System.out.println("本商品9.5折");
            moneys = jiaGe * 0.95;
        } else {
            System.out.println("不好意思，本商品没有折扣");
            moneys = jiaGe;
        }
        return moneys;
    }

    public static void main(String[] args) {
        System.out.println("请输入商品嘉价格(单位：元)：");
        Scanner scanner = new Scanner(System.in);
        double money = scanner.nextDouble();
        DisCountDemo disCountDemo = new DisCountDemo();
        disCountDemo.daZhe(money);
        System.out.println("折后商品的总价是：" + moneys);
    }
}
