import sun.awt.windows.WPrinterJob;

import javax.xml.ws.soap.Addressing;
import java.util.Arrays;

public class main<Add> {

    public static void Print(int[] arr){
        for(int e : arr){
            System.out.println(e);
        }
    }

    public static void func(int[] arr){
        arr[0] = 100;
        System.out.println("arr[0] = " + arr[0]);
    }
    public static void main(String[] args) {

        // 数组的基本用法
        // 创建数组
        // int[] a= new int[3]{1,2,3};
        // int[] arr = {1,2,3};
        // System.out.println(arr[0]);

        // // 数组的使用
        // System.out.println("length:" + arr.length);
        // for (int i = 0; i <arr.length ; i++) {
        //     System.out.println(arr[i]);
        // }
        // for(int x : arr){
        //     System.out.println(x);
        // }

        // // 数组作为参数的方法
        // Print(arr);

        // int[] arr = {1,2,3};
        // func(arr);
        // System.out.println("arr[0] = " + arr[0]);

        // 数组作为方法的返回值
        // int[] arr = {1,2,3,4,5,6,7,8,9};
        // Print(arr);
        // transform(arr);
        // Print(arr);
        // Print(transform1(arr));

        // 数字练习
        // 数组转字符串
        // int[] arr = {1,2,3,4,5,6,7,8,9};
        // String newArr = Arrays.toString(arr);
        // System.out.println(newArr);

        // int[] arr = {1,2,3,4,5,6,7,8,9};
        // int[] newArr = Arrays.copyOf(arr, arr.length);
        // Print(newArr);
        // 二分查找
        // int[] arr = {1,2,3,4,5,6,7,8,9};
        // System.out.println(binarySearch(arr, 2));

        int[] arr = {9,8,7,6,5,4,3,2,1};
        //BubbleSort(arr);
        Reverse(arr);
        Print(arr);
    }

    public static void Reverse(int[] arr) {
        int begin = 0;
        int end = arr.length - 1;
        while(begin <= end){
            int tmp = arr[begin];
            arr[begin] = arr[end];
            arr[end] = tmp;
            begin++;
            end--;
        }
    }


    public static void BubbleSort(int[] arr) {
        for(int i = 0; i < arr.length - 1; ++i){
            int flag = 1;
            for(int j = 0; j < arr.length - i - 1; ++j){
                if(arr[j] > arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                    flag = 0;
                }
            }
            if(flag == 1){
                break;
            }
        }
    }

    public static int binarySearch(int[] arr, int toFind){
        int begin = 0;
        int end = arr.length-1;
        while(begin <= end){
            int mid = (begin + end) / 2;
            if(arr[mid] == toFind){
                return mid;
            }else if(arr[mid] > toFind){
                end = mid-1;
            }else{
                begin = mid+1;
            }
        }
        return -1;
    }

    private static int[] transform1(int[] arr) {
        int ret[] = new int[arr.length];
        for (int i = 0; i < arr.length ; i++) {
            ret[i] = arr[i] * 2;
        }
        return ret;
    }

    public static void transform(int[] arr) {
        for (int i = 0; i <arr.length ; i++) {
            arr[i] *= 2;
        }
    }
}
