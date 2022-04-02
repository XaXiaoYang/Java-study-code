package com.nanbei.method;

public class MethodDemo {

    public void printStar() {
        System.out.println("*********************************");
    }

    public static void main(String[] args) {
        MethodDemo md = new MethodDemo();
        md.printStar();
        System.out.println("Hello World");
        md.printStar();
    }


}
