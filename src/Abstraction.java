abstract class Bike{
    Bike(){System.out.println("bike is created");}
    abstract void run();
   // abstract void sun();
    void changeGear(){System.out.println("gear changed");}
}
//Creating a Child class which inherits Abstract class
class Honda extends Bike{
    void run(){System.out.println("Honda running safely..");}
    void tun(){System.out.println("Honda tunning safely..");}
}
class Hero extends Honda{
    //void run(){System.out.println("Hero running safely..");}
}
//Creating a Test class which calls abstract and non-abstract methods
class Abstraction {
    public static void main(String args[]){
        Bike obj = new Hero();
        obj.run();
      //  obj.fun();
      //  obj.tun();
        obj.changeGear();
    }
}
