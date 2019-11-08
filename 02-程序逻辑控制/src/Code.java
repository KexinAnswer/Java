import sun.awt.windows.WPrinterJob;

import java.util.Scanner;

public class Code {
    public static void main(String[] args) {
        // 1. 根据年龄，打印出当前年龄的人是少年(低于18), 青年(19-28),
        // 中年(29-55),老年(56以上)
        // Scanner sc = new Scanner(System.in);
        // int age = sc.nextInt();
        // if(age < 18){
        //     System.out.println("少年");
        // }else if(age < 28){
        //     System.out.println("青年");
        // }else if(age < 55){
        //     System.out.println("中年");
        // }else {
        //     System.out.println("老年");
        // }

        // 2. 判定一个数字是否是素数
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // int i = 0;
        // for (i = 2; i < Math.sqrt(num) ; i++) {
        //     if(num % i == 0){
        //         System.out.println("不是素数");
        //         break;
        //     }
        // }
        // if(i > Math.sqrt(num)){
        //     System.out.println("是素数");
        // }

        // 3. 打印 1-100 之间所有的素数
        // for (int i = 1; i <=100 ; i++) {
        //     int j = 2;
        //     for (j = 2; j < Math.sqrt(i) ; j++) {
        //         if(i % j == 0){
        //             break;
        //         }
        //     }
        //     if(j > Math.sqrt(i)){
        //         System.out.println(i);
        //     }
        // }

        // 4. 输出 1000 - 2000 之间的所有闰年
        // for (int i = 1000; i <= 2000 ; i++) {
        //     if((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)){
        //         System.out.println(i);
        //     }
        // }

        // 5. 输出乘法口诀表
        // for (int i = 1; i <10 ; i++) {
        //     for (int j = 1; j <= i ; j++) {
        //         System.out.printf("%d * %d = %d ", j,i,j*i);
        //     }
        //     System.out.printf("\n");
        // }

        // 6. 求两个整数的最大公约数
        //Scanner sc = new Scanner(System.in);
        //int num1 = sc.nextInt();
        //int num2 = sc.nextInt();
        //if(num2 > num1){
        //    int tmp = num1;
        //    num1 = num2;
        //    num2 = tmp;
        //}
        //while(num2 != 0){
        //    int tmp = num1 % num2;
        //    num1 = tmp; num2 = num1;
        //}
        //System.out.println(num1);

        // 7. 计算 1/1 - 1/2 - 1/3 - ... 1/99 - 1/100
        // double sum = 0;
        // for (int i = 1; i <= 100 ; i++) {
        //     sum += 1.0/i;
        // }
        // System.out.printf("%.2f",sum );

        // 8. 编写程序数一下 1 - 100 之间出现了多少个 9
        // int count = 0;
        // for (int i = 1; i <100 ; i++) {
        //     int j = i;
        //     while(j != 0){
        //         if(j % 10 == 9){
        //             count++;
        //         }
        //         j /= 10;
        //     }
        // }
        // System.out.println(count);

        // 9. 求出 0 - 999 之间的所有水仙花数并输出
        // for (int i = 100; i <999 ; i++) {
        //     int sum = 0;
        //     int j = i;
        //     while(j != 0){
        //         sum += Math.pow(j%10, 3) ;
        //         j /= 10;
        //     }
        //     if(sum == i){
        //         System.out.println(i);
        //     }
        // }

        // 10. 编写代码模拟三次输入密码的场景，最多能输出三次密码
        //     密码正确，提示登陆成功， 密码错误 可以重新输入， 最多输入三次
        //     三次都错 退出程序

        // String password = "qweqwe";
        // Scanner sc = new Scanner(System.in);
        // int i = 0;
        // while(i < 3){
        //     System.out.println("请输入密码:");
        //     String pw = sc.nextLine();
        //     if(pw.equals(password)){
        //         System.out.println("密码输入正确, 登录成功");
        //         break;
        //     }
        //     ++i;
        //     System.out.printf("密码输入错误, 请重新错误, 还有 %d 次机会\n", 3-i );
        // }
        // if(i == 3){
        //     System.out.println("输入次数过多， 程序退出");
        // }

        // 11. 写一个函数返回参数二进制中 1 的个数
        // Scanner sc = new Scanner(System.in);
        // System.out.println("请输入一个正整数");
        // int num = sc.nextInt();
        // int cur = 1;
        // int count = 0;
        // while(cur != 0){
        //     if((cur & num) == cur){
        //         count++;
        //     }
        //     cur = cur << 1;
        // }
        // System.out.println(count);

        // 12. 获取一个二进制程序序列中所有的偶数位 和 奇数位 分别输出二进制序列
        // 13. 输出一个整数的每一位
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while (num != 0){
            System.out.println(num%10);
            num /= 10;
        }

    }
}
