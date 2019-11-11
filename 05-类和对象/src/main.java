/***
 * @Author WBrook
 * @Description //TODO 
 * @Date 8:46 2019/11/11
 * @return 
 **/
public class main {

    // 类
    // static 关键字
    static class TestDemo{
        public int a;
        public static int count;

        public static void change(){
            count = 100;
            // a = 10;
        }
    }

    public static void main(String[] args) {
        // Person person = new Person();
        // person.eat();
        // person.sleep();
        // System.out.println(person.age);
        // System.out.println(person.name.length());
        // person.show();

        // TestDemo t1 = new TestDemo();
        // t1.a++;
        // TestDemo.count++;
        // System.out.println(t1.a);
        // System.out.println(TestDemo.count);

        // System.out.println("==================");

        // TestDemo t2 = new TestDemo();
        // t2.a++;
        // TestDemo.count++;
        // System.out.println(t2.a);
        // System.out.println(TestDemo.count);

        // TestDemo.change();
        // System.out.println(TestDemo.count);


        // class Person{
        //     // 字段
        //     private int age = 18;
        //     private String name = "张三";
        //     public String sex = "男";

        //     // 默认构造方法
        //     public Person(){
        //         this("JKLove",21,"女");
        //     }

        //     public Person(String name, int age, String sex){
        //         this.name = name;
        //         this.age = age;
        //         this.sex = sex;
        //     }
        //     // 方法

        //     public void setName(String name){
        //         this.name = name;
        //     }

        //     public String getName(){
        //         return name;
        //     }
        //     public void eat(){
        //         System.out.println("吃饭");
        //     }

        //     public void sleep(){
        //         System.out.println("睡觉");
        //     }

        //     public void show(){
        //         System.out.println("我叫" + name + "今年" + age + "了");
        //     }
        // }

        // Person person = new Person();
        // person.setName(("WBrook"));
        // String name = person.name;
        // System.out.println(name);

        class Person {
            private String name;
            private String sex;
            private int age;

            {
                this.name ="zhangsan";
                this.sex =sex = "male";
                this.age =age = 32;
            }

            public String toString(){
                return "Person{" +
                        "name='" + name + "\'" +
                        ", age=" + age +
                        '}';
            }

            public void show(){
                System.out.println("name :" + this.name);
                System.out.println("sex :" + this.sex);
                System.out.println("age :" + this.age);
            }

        }
        Person p1 = new Person();
        p1.show();
        // Person p2 = new Person("WBrook", 18, "男");
        // p2.show();
        System.out.println(p1);

    } // end for main
}
