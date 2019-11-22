public class Extends {
    public static void main(String[] args) {
        // Cat cat = new Cat("咪咪");
        // cat.eat("猫粮");
        // Bird bird = new Bird("远远");
        // bird.fly();

        // Bird bird = new Bird("远远");
        // Animal bird2 = bird;
        // Animal bird3 = new Bird("圆圆");

        // feed(bird);
        // feed(findAnimal());

        Bird bird = new Bird("远远");
        feed(bird);
    }


    public static Animal findAnimal(){
        Bird bird = new Bird("媛媛");
        return bird;
    }

    public static void feed(Animal animal){
        animal.eat("谷子");
    }
}

// 动物 父类
class Animal {
    protected String name;

    public Animal(String name ){
        this.name = name;
    }

    public void eat(String food){
        System.out.println(this.name + "正在吃" + food);
    }
}

// 子类 猫
class Cat extends Animal{

    public Cat(String name) {
        // 使用 super 调用父类的构造方法
        super(name);
    }
}

// 子类 鸟
class Bird extends Animal{

    public Bird(String name) {
        super(name);
    }


    public void fly(){
        System.out.println(this.name + "正在飞 ~_~");
    }
}


