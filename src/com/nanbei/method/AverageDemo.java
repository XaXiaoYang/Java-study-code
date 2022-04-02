package com.nanbei.method;

//求数组元素的平均值
public class AverageDemo {
    //定义对象
    //创建float类型的数组并初始化
    //调用方法求平均值并打印输出

    public float average(float[] arr) {
        float avg = 0;
        float sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            avg = sum / arr.length;
        }
        return avg;
    }

    public static void main(String[] args) {
        float[] arr = {78.5f, 98.5f, 65.5f, 32.5f, 75.5f};
        AverageDemo averageDemo = new AverageDemo();
        float result = averageDemo.average(arr);
        System.out.println("数组平均值是:"+result);
    }
}
