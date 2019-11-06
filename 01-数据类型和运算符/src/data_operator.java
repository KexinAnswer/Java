import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class data_operator {
    public static void main(String[] args) {
        // 1.1 整形变量
//        int num = 10; // 定义一个变量
//        System.out.println(num);
//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(Integer.MIN_VALUE);
//
//        int maxValue = Integer.MAX_VALUE;
//        System.out.println(maxValue+1);
//
//        int minValue = Integer.MIN_VALUE;
//        System.out.println(minValue-1);

        // 1.2 长整型变量
//        long num = 10L; // 定义个长整型变量， 初始值写作 10L 也可以是 l
//        System.out.println(num);
        // 注意事项
        // 1. 基本语法格式和创建 int 变量一致， 只是把类型变成 long
        // 2. 初始化设定的值为 10L ， 表示一个长整型数字。 10l 也可以
        // 3. 使用 10 初始化也可以， 10 的类型是 int， 10L 的类型是long
        //    使用 10L 或者 10l 更好一些
        // java 中 long 类型 占 8 个字节。表示数据范围 -2^63 -> 2^63-1
//        System.out.println(Long.MAX_VALUE);
//        System.out.println(Long.MIN_VALUE);
        // 9223372036854775807
        // -9223372036854775808

        // 1.3 上精度浮点型变量
        //double num = 10;
        //System.out.println(num);

        //int a = 1;
        //int b = 2;
        //System.out.println(a / b);
        //// 执行结果 0
        //double x = 1.0;
        //double y = 2.0;
        //System.out.println(x / y);
        //// 执行结果 0.5

        //double num1 = 1.1;
        //System.out.println(num1 * num1);
        // 执行结果 1.2100000000000002
        // java中的 double 类型虽然也是 8 个字节，但是浮点数的内存布局和整数
        // 差别很大，不能单纯的 用 2^n 的形式表示数据范围
        // java 的 double 类型内存布局遵循 IEEE 745标准(和 C语言一样)
        // 尝试使用有限的内存空间表示可能无线的小数，势必会才能在一定的精度误差

        // 1.4 单精度浮点变量
        // float num = 1.0f;
        // System.out.println(num);
        // float 类型 在 Java 中 只占 4个 字节， 同样遵循 IEEE 754 标准
        // 由于表示的数据精度范围较小， 一般在工程上用到浮点数都有限考虑doube 不太推荐用 float

        // 1.5 字符类型变量
        // char ch = 'A';
        // System.out.println(ch);
        // 注意事项
        // 1. Java 中使用 单引号 + 单个字母 的形式表示字符字面值
        // 2. 计算机中的字符本质上是一个整数， 在 C 语言中使用 ASCII 表示字符
        // 而 Java 中 使用  Unicode 表示字符 因此一个字符占用两个字节大小
        // 表示的字符种类更多包括中文
        // char nch = '啊';
        // System.out.printf(String.valueOf(nch));

        // 1.6 字节类型
        // byte b = 0;
        // System.out.println(b);
        // 注意事项
        // 字节类型表示的也是整数， 只占一个字节， 表示范围较小(-128-> +127)
        // 字节类型和字符类型互不相干

        // 1.7 短整型变量
        // short value = 0;
        // System.out.println(value);
        // 注意事项：
        // short 占用 2 个字节 表示数据范围 -32768 -> +32767
        // 这个表示范围比较小， 一般不推荐使用

        // 1.8 布尔类型
        // boolean value = true;
        // System.out.println(value);
        // 注意事项
        // 1. boolean 类型的变量只有两种取值， true 表示真 false 表示假
        // 2. java boolean 类型 和 int 类型不能相互转换， 不存在 1 表示 true  2 表示 false 这样的说法
        // 3. boolean 类型有些 JVM 的实现只占 1 个字节，有些是占 1 个比特位 ，这个没有明确规定
        // boolean value = true;
        // System.out.println(value + 1);  出现错误

        // 1.9 字符串类型变量
        //String name = "zhangsan";
        //System.out.println(name);

        // 注意事项
        // 1. java 使用 双引号 + 若干字符 的方式表示字符串字面值
        // 2. 和上面的类型不同， string 不是基本类型 而是引用类型
        // 3. 自负床中的一些特定的不太方便直接表示的字符需要进行转义

//         String a = "hello";
//         String b = "world";
//         String c = a + b;
//         System.out.println(c);
//
        // String str = "result = ";
        // int a = 10;
        // int b = 20;
        // String result = str + a + b;
        // System.out.println(result);
        // 1020

        // int a = 10;
        // int b = 20;
        // System.out.println("a = " + a + " b = " + b);

        // 1.10 变量的作用域

        // {
        //     int x = 10;
        //     System.out.println(x);
        // }

        // System.out.println(x);

        // 1.12 类型转换
        // int a = 10;
        // long b = 20;
        // a = b;  编译错误 损失精度
        // b = a;

        // int a = 10;
        // double b = 1.0;
        // a = b; 编译错误 损失精度
        // b = a;

        //int a =10;
        //boolean b = true;
        //b = a;  编译不通过
        //a = b; 编译不通过

        // byte a = 100;
        // byte b = 256;  编译报错 提示 从 int 转换到 byte 可能会有损失

        // int a = 0;
        // double b = 10.5;
        // a = (int)b;
        // System.out.println(a);

        // int a = 10;
        // boolean b = fale;
        // b = (boolean)a;  编译出错

        // 结论： 使用强制类型转换的方式 可以将 double 类型强制转成 int 但是
        // 1. 强制类型转换可能会导致精度丢失，如果刚才的例子中， 赋值之后10.5 就变成了 10 小数点后面的部分被忽略
        // 2. 强制类型转换不是一定能成功，互补相干的类型之间无法强转
        // 类型转换小结
        // 1. 不同数字类型的变量之间赋值， 表示范围更小的类型能隐式类型转换成较大的类型
        // 2. 如果需要把范围大的类型赋值给范围小的类型，需要强制类型转换，但是可能精度丢失
        // 3. 将一个字面值常量进行赋值的时候，Java会自动针对数字范围进行检查

        // 1.13 数值提升
        // int 和 long 混合运算
        //int a = 10;
        //long b = 20;
        //int c = a + b; 编译出错
        //long d = a + b;
        // 结论： 当 int 和 byte 混合运算的时候， int 会提升成 long，得到的结果仍是 long 类型
        // 需要使用 long 类型的变量来接收结果，如果非要用 int 来接收结果 就需要强制类型转换

        // byte 和 byte 的运算
        //byte a = 10;
        //byte b = 20;
        //byte c = a + b;
        // Error 不兼容的类型， 从 int 转换成 byte 可能会有损失

        //byte a = 10;
        //byte b = 20;
        //byte c = (byte)(a + b);
        //System.out.println(c);

        // 类型提升小结
        // 1. 不同类型的数据混合运算，范围小的会提升成范围大的
        // 2. 对于 short， byte这种比 4 个字节小的类型，会先提升成 4 个字节的int 在运算

        // 2.1 算数运算符
        //int a = 1;
        //int b = 0;
        //System.out.println(a / b);

        //System.out.println(11.5 % 2.0);

        //int a = 10;
        //a += 1;
        //System.out.println(a);

        //int a = 10;
        //int b = ++a;
        //System.out.println(b);
        //int c = a++;
        //System.out.println(c);


        // 结论：
        // 1. 如果不取自增运算的表达式返回值， 则 前置自增和后置自增没有区别
        // 2. 如果取表达式的返回值，则前置自增的返回值是自增之后的值，后置自增的返回值是自增之前的值

        //2.2 关系运算符
        //int a = 10;
        //int b = 20;
        //System.out.println(a == b);
        //System.out.println(a != b);
        //System.out.println(a < b);
        //System.out.println(a > b);
        //System.out.println(a <= b);
        //System.out.println(a >= b);

        // 2.3 逻辑运算符
        //int a = 10;
        //int b = 20;
        //int c = 30;
        //System.out.println(a < b && b < c);
        //System.out.println(a < b || b < c);
        //System.out.println(!(a < b));

        //System.out.println(10 > 20 && 10 / 0 ==0);
        //System.out.println(10 < 20 || 10 / 0 ==0);

        //System.out.println(10 > 20 & 10 / 0 ==0);
        //System.out.println(10 < 20 | 10 / 0 ==0);

        // 2.4 位运算符
        // int a = 10;
        // int b = 20;
        // System.out.println(a & b);
        // System.out.println(a | b);

        // int a = 0xf;
        // System.out.printf("%x\n", ~a);

        // 注意：
        // 1. 0x 前缀的数字为 16进制 数字， 十六进制可以看成是二进制的简化表达方式
        // 一个十六进制数字对应 4个 二进制位
        // 0xf 表示 10进制的 15， 也就是二进制的 1111
        // printf 能够格式化输出内容， %x 表示按照 十六进制输出
        // \n 表示换行
        //int a = 0x1;
        //int b = 0x2;
        //System.out.printf("%x\n", a^b);

        // 2.5 位运算
        //int a = 0x10;
        //System.out.printf("%x\n", a << 1);
        //System.out.printf("%x\n", a >> 1);

        // int a = 0xffffffff;
        // System.out.printf("%x\n", a >>> 1);

        // 注意：
        // 1. 左移 1 位 相当于原数字 * 2 左移 N 位相当于 原数字 * 2 的 N 次方
        // 2. 右移 1 位 相当于原数字 / 2 右移 N 位相当于 原数字 / 2 的 N 次方
        // 3. 由计算机计算以为效率高于计算乘除 当某个代码正好乘除 2 的N 次方的时候可以用移位运算替代
        // 4. 移动负数位 或者 移位位数过于大都没有意义

        // 2.6 条件运算符
        //
        // int a = 10;
        // int b = 20;
        // int max = a > b ? a : b;
        // System.out.println(max);

        // System.out.println(1 + 2 * 3);
        // System.out.println(10 < 20 && 20 < 30);



    }
}
