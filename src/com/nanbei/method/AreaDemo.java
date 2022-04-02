package com.nanbei.method;

public class AreaDemo {
    //求圆形面积
    public double area(double n) {
        double mianJi = n * n * Math.PI;
        return mianJi;
    }
    //求长方形面积
    public double area(double n, double m) {
        double mianJi2 = n * m;
        return mianJi2;
    }
    public static void main(String[] args) {
        //定义对象
        AreaDemo areaDemo = new AreaDemo();
        double yuan = areaDemo.area(4.5);
        double changFangXing = areaDemo.area(8, 5);
        System.out.println("圆的面积是：" + yuan);
        System.out.println("长方形的面积是：" + changFangXing);
    }
}
