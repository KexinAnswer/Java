import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;

import java.util.Random;
import java.util.Scanner;

public class logic {
    public static void main(String[] args) {
        // 1. 顺序结构
        // System.out.println("aaa");
        // System.out.println("bbb");
        // System.out.println("ccc");

        // 2. 分支结构
        // int num = 10;
        // if(num % 2 == 0){
        //     System.out.println("num 是偶数");
        // }else{
        //     System.out.println("num 是奇数");
        // }

        // int year = 2000;
        // if((year % 4 == 0 && year % 100 == 0) || year % 400 == 0){
        //     System.out.println("是闰年");
        // }else{
        //     System.out.println("不是闰年");
        // }

        // 2.2 switch 语句
        // int day = 1;
        // switch (day){
        //     case 1:
        //         System.out.println("星期一");
        //         // break;
        //     case 2:
        //         System.out.println("星期二");
        //         break;
        //     case 3:
        //         System.out.println("星期三");
        //         break;
        //     case 4:
        //         System.out.println("星期四");
        //         break;
        // }

        // switch 中的值只能是整数|枚举|字符|字符串

        // 3. 循环结构
        // 打印 1-10 的数字
        // int num = 1;
        // while (num <= 10){
        //     System.out.println(num);
        //     num++;
        // }

        // 计算 1-100 的和
        // int n = 1;
        // int result = 0;
        // while(n <= 100){
        //     result += n;
        //     n++;
        // }
        // System.out.println(result);

        // 计算 5 的阶乘
        // int n = 1;
        // int res = 1;
        // while(n <= 5){
        //     res *= n;
        //     ++n;
        // }
        // System.out.println(res);


        // int n = 1;
        // int sum = 0;
        // while(n <= 5){
        //     int res = 1;
        //     int i = 1;
        //     while(i <= n){
        //         res *= i;
        //         ++i;
        //     }
        //     ++n;
        //     System.out.println(res);
        //     sum += res;
        // }
        // System.out.println(sum);

        // 3.2 break
        // 找到 100 - 200 中第一个三的倍数
        // int num = 100;
        // while(num < 300){
        //     if(num % 3 == 0){
        //         break;
        //     }
        //     num++;
        // }

        // System.out.println(num);

        // 3.3 continue
        // 找到 100-200 中所有 3 的倍数

         // 找到 100 - 200 中第一个三的倍数
         //int num = 100;
         //while(num < 300){
         //    if(num % 3 != 0){
         //        num++;
         //        continue;
         //    }
         //    num++;
         //    System.out.println(num);
         //}

        // 3.4 for
        //for (int i = 1; i <=10 ; i++) {
        //    System.out.println(i);
        //}

        // int i = 0;
        // do {
        //     System.out.println(i);
        //     ++i;
        // }while(i <= 10);

        // 4.1 输入到控制台
        // String msg = "hello world";
        // System.out.println(msg);
        // System.out.print(msg);
        // System.out.printf("%s\n", msg);

        // 4.2 从键盘输入
        // Scanner sc = new Scanner(System.in);
        // System.out.printf("请输入姓名:");
        // String name = sc.nextLine();
        // System.out.println(name);

        // System.out.println("请输入年龄:");
        // int age = sc.nextInt();
        // System.out.println(age);
        // sc.close();

        // 使用 Scanner 循环读取 N 个数字
        // Scanner sc = new Scanner(System.in);
        // double sum = 0;
        // int num = 0;
        // while(sc.hasNextDouble()){
        //     double tmp = sc.nextDouble();
        //     sum += tmp;
        //     num++;
        // }
        // System.out.println(sum);

        // 5 猜数字游戏
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int toGuess = random.nextInt(100);
        while(true){
            System.out.println("请输入1-100以内的数字");
            int num = sc.nextInt();
            if(num > toGuess){
                System.out.println("猜大了");
            }else if(num < toguess){
                System.out.println("猜小了");
            }else{
                System.out.println("猜对了");
                System.out.println("答案是" + toGuess);
                break;
            }
        }
    }
}

