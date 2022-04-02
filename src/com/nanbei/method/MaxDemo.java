package com.nanbei.method;

import java.util.Scanner;

public class MaxDemo {
    public void max(int a, int b) {
        int max;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        System.out.println("max=" + max);
    }

    public static void main(String[] args) {
        int[] arr = new int[2];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            System.out.println("请输入第" + (i + 1) + "数字：");
            arr[i] = scanner.nextInt();
        }
        int m = arr[0];
        int n = arr[1];
        MaxDemo maxDemo = new MaxDemo();
        maxDemo.max(m, n);
    }
}
