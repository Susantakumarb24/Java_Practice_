import java.util.Scanner;
class Susa{
    void area(double x)
    {
        System.out.println("Area of the Circle= "+3.14*Math.pow(x,2));
    }
    void area(float x,float y)
    {
        System.out.println("Area of the Rectangle= "+x*y);
    }
    void area(float x)
    {
        System.out.println("Area of the Square= "+x*x);
    }
}

public class AreaMethodOverloading {
    public static void main(String[] args) {
          Susa ob=new Susa();
          Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius: ");
        ob.area(sc.nextFloat());
    }
}
