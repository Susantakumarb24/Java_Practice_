class A {
    int speed;
    String name;
    A() {
        //name="Susant";
        System.out.println("speed is " + speed+"\nName is "+name);
    }

    {
        speed = 100;
    }
    {
        name="Light";
        speed=333;
    }
}
    public class InstanceInitializerBlock {
    public static void main(String[] args) {
        A ob=new A();

    }
}
