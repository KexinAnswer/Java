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
//        char ch = 'A';
//        System.out.printf(String.valueOf(ch));
        // 注意事项
        // 1. Java 中使用 单引号 + 单个字母 的形式表示字符字面值
        // 2. 计算机中的字符本质上是一个整数， 在 C 语言中使用 ASCII 表示字符
        // 而 Java 中 使用  Unicode 表示字符 因此一个字符占用两个字节大小
        // 表示的字符种类更多包括中文
//        char nch = '啊';
//        System.out.printf(String.valueOf(nch));

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
        String name = "zhangsan";
        System.out.println(name);

        // 注意事项
        // 1. java 使用 双引号 + 若干字符 的方式表示字符串字面值
        // 2. 和上面的类型不同， string 不是基本类型 而是引用类型
        // 3. 自负床中的一些特定的不太方便直接表示的字符需要进行转义


    }
}
