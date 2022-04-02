package com.nanbei.datamanage;

import java.util.Scanner;

public class DataManage {

    /**
     * 新建数组
     *
     * @return 数组
     */
    public int[] insertData() {
        int[] arr = new int[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.println("请输入第" + (i + 1) + "个元素：");
            try {
                arr[i] = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("输入有误，请输入数字！");
                scanner.next();
                i--;
            }
        }
        return arr;
    }

    /**
     * 显示所有数组内容
     *
     * @param arr    数组
     * @param length 数组长度
     */
    public void showData(int[] arr, int length) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    /**
     * @param arr 原数组
     * @param n   插入元素
     * @param k   插入地址
     */
    public void insertArray(int[] arr, int n, int k) {
        for (int i = arr.length - 1; i > k; i--) {
            arr[i] = arr[i - 1];
        }
        arr[k] = n;
    }

    /**
     * 被3整除的数
     *
     * @param arr
     */
    public void divThree(int[] arr) {
        String str = "";
        int count = 0;
        for (int i : arr) {
            if (i % 3 == 0) {
                str = str + i + " ";
                count++;
            }
        }
        if (count == 0) {
            System.out.println("数组中没有能被3整除的数。");
        } else {
            System.out.println("数组中有能被3整除的数:" + str);
        }
    }

    /**
     * 提示信息
     */
    public void notice() {
        System.out.println("*************************");
        System.out.println("1--插入数据");
        System.out.println("2--显示数据");
        System.out.println("3--指定插入");
        System.out.println("4--被三整除");
        System.out.println("0--退出");
        System.out.println("*************************");
    }

    public static void main(String[] args) {
        DataManage dataManage = new DataManage();
        Scanner scanner = new Scanner(System.in);
        int[] a = null;
        int input = 0, n = 0, k = 0;
        while (true) {
            dataManage.notice();
            System.out.println("请输入对应的数字进行操作：");
            try {
                input = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("输入的数字操作错误，请重新输入范围内数字");
                scanner.next();
                continue;
            }
            if (input == 0) {
                System.out.println("退出系统");
                break;
            }
            switch (input) {
                case 1:
                    a = dataManage.insertData();
                    System.out.println("数组的元素是：");
                    dataManage.showData(a, a.length - 1);
                    break;
                case 2:
                    if (a != null) {
                        System.out.println("数组的元素是：");
                        if (a.length - 1 == 0) {
                            dataManage.showData(a, a.length - 1);
                        } else {
                            dataManage.showData(a, a.length);
                        }
                    } else {
                        System.out.println("还没有在数组中插入元素，请重新选择");
                    }
                    break;
                case 3:
                    if (a != null) {
                        System.out.println("请输入要插入的数据和位置");
                        try {
                            n = scanner.nextInt();
                        } catch (Exception e) {
                            System.out.println("输入的数据格式错误，请重新输入");
                            scanner.next();
                            break;
                        }
                        try {
                            k = scanner.nextInt();
                        } catch (Exception e) {
                            System.out.println("输入的数据格式错误，请重新输入");
                            scanner.next();
                            break;
                        }
                        dataManage.insertArray(a, n, k);
                        System.out.println("当前的数组的元素是：");
                        dataManage.showData(a, a.length);
                    } else {
                        System.out.println("还没有在数组中插入元素，请重新选择");
                    }
                    break;
                case 4:
                    if (a != null) {
                        dataManage.divThree(a);
                    } else {
                        System.out.println("还没有在数组中插入元素，请重新选择");
                    }
                    break;
            }
        }
    }
}
