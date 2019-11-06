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


        int n = 1;
        int sum = 0;
        while(n <= 5){
            int res = 1;
            int i = 1;
            while(i <= n){
                res *= i;
                ++i;
            }
            ++n;
            System.out.println(res);
            sum += res;
        }
        System.out.println(sum);
    }
}
