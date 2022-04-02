package com.nanbei.datamanage;

import java.util.Scanner;

public class StudentScore {

    /**
     * 显示菜单方法
     */
    public void displayMenu() {
        System.out.println("**************************");
        System.out.println("  1--初始化数学成绩");
        System.out.println("  2--求平均成绩");
        System.out.println("  3--统计成绩大于85分的人数");
        System.out.println("  4--修改指定位置的成绩");
        System.out.println("  5--输出所有成绩");
        System.out.println("  0--退出系统");
        System.out.println("**************************");
    }

    /**
     * 初始化数组长度和元素
     *
     * @param n 数组长度
     * @return
     */
    public float[] initScore(int n) {
        float[] floats = new float[n];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < floats.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个成绩：");
            try {
                floats[i] = scanner.nextFloat();
            } catch (Exception e) {
                System.out.println("输入有误，请重新输入成绩！");
                scanner.next();
                i--;
            }
        }
        return floats;
    }

    /**
     * 求所有成绩的平均成绩
     *
     * @param arr
     * @return
     */
    public float average(float[] arr) {
        float sum = 0, avg = 0;
        if (arr[arr.length - 1] != 0) {
            //插入新数据后求平均
            for (int i = 0; i < arr.length; i++) {
                sum = sum + arr[i];
                avg = sum / arr.length;
            }
        } else {
            //未插入新数据后求平均
            for (int i = 0; i < arr.length - 1; i++) {
                sum = sum + arr[i];
                avg = sum / (arr.length - 1);
            }
        }
        return avg;
    }

    /**
     * 显示所有成绩
     *
     * @param arr
     */
    public void displayAllScore(float[] arr) {
        if (arr[arr.length - 1] != 0) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        } else {
            for (int i = 0; i < arr.length - 1; i++) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

    /**
     * 求成绩大于85分的人数
     *
     * @param arr
     * @return
     */
    public int count(float[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 85.0) {
                count++;
            }
        }
        return count;
    }

    /**
     * 更改成绩到新数组
     *
     * @param arr      成绩数组
     * @param newScore 新成绩
     * @param index    修改位置
     */
    public void update(float[] arr, int newScore, int index) {
        for (int i = 0; i < arr.length - 1; i++) {
            arr[index - 1] = newScore;
        }
    }

    public static void main(String[] args) {
        StudentScore studentScore = new StudentScore();
        Scanner scanner = new Scanner(System.in);
        float[] floats = null;
        int input = 0, k = 0, newScore = 0, l = 0;

        while (true) {
            studentScore.displayMenu();
            System.out.println("******请选择输入上方指引进行操作：");
            try {
                input = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("******输入的数字操作错误，请重新输入范围内数字");
                scanner.next();
                continue;
            }
            if (input == 0) {
                System.out.println("******退出系统啦");
                break;
            }

            switch (input) {
                case 1:
                    System.out.println("******请输入数组的长度:");
                    try {
                        l = scanner.nextInt();
                        floats = studentScore.initScore(l);
                        System.out.println("******输入的成绩是：");
                        studentScore.displayAllScore(floats);
                    } catch (Exception e) {
                        System.out.println("******输入的数据长度不正确，请重新输入");
                        scanner.next();
                        break;
                    }
                    break;
                case 2:
                    System.out.println("******开始计算平均值：......");
                    float result = studentScore.average(floats);
                    System.out.println("******计算平均值的结果是：" + result);
                    break;
                case 3:
                    int c = studentScore.count(floats);
                    System.out.println("******成绩大于85分的有" + c + "人");
                    break;
                case 4:
                    System.out.println("******修改前的成绩");
                    studentScore.displayAllScore(floats);
                    try {
                        System.out.println("******请输入要修改的位置：");
                        k = scanner.nextInt();
                    } catch (Exception e) {
                        System.out.println("******输入的数字格式错误，请重新输入插入位置");
                        scanner.next();
                        break;
                    }
                    try {
                        System.out.println("******请输入要修改的数学成绩：");
                        newScore = scanner.nextInt();
                    } catch (Exception e) {
                        System.out.println("******输入的数字格式错误，请重新输入成绩");
                        scanner.next();
                        break;
                    }
                    try {
                        studentScore.update(floats, newScore, k);
                    } catch (Exception e) {
                        System.out.println("******数组越界，请输入数组长度内的值，现数组的长度是:" + (l));
                        break;
                    }
                    System.out.println("******修改后的成绩");
                    studentScore.displayAllScore(floats);
                    break;
                case 5:
                    System.out.println("******展示所有成绩：");
                    studentScore.displayAllScore(floats);
                    break;
            }
        }

//        studentScore.displayMenu();
//        float[] floats = studentScore.initScore(5);
//        System.out.println("原始数组");
//        studentScore.displayAllScore(floats);
//        studentScore.update(floats,98,3);
//        System.out.println("插入新元素后");
//        studentScore.displayAllScore(floats);
//        float q = studentScore.average(floats);
//        System.out.println("平均成绩是：" + q);
//        int c = studentScore.count(floats);
//        System.out.println("成绩大于85分的有" + c + "人");

    }
}
