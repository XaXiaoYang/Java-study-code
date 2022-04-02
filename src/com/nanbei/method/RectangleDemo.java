package com.nanbei.method;

public class RectangleDemo {
    //    求长方形面积
    public int area() {
        int chang = 3, kuan = 6;
        return chang*kuan;
    }

    public static void main(String[] args) {
        RectangleDemo rectangleDemo = new RectangleDemo();
        System.out.println("长方形面积是："+rectangleDemo.area());
    }
}
