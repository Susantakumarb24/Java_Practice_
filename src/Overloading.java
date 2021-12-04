class Addition{
    void add1()
    {
        System.out.println("i am add 1");
    }
    //in method overloading we can have methods with same name and return type
    //but the arguments must not be same or equal
    void add1(int x)
    {
        System.out.println("i am add 2");
    }
    void add1(int x,int y)
    {
        System.out.println("i am add 3");
    }
}
class Subtract extends Addition{
    void add1()
    {
        super.add1();
        System.out.println("i am subtract  1");

    }
}

public class Overloading {
    public static void main(String[] args) {
       // Addition ob1=new Addition();
        Subtract ob=new Subtract();
        ob.add1();
        ob.add1(22);
    }

}
