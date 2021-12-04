import java.util.Scanner;

class Circle{
    int radius;
    Circle(int r)
    {
        this.radius=r;
    }
    void area()
    {
        System.out.println("area = "+Math.PI*Math.pow(radius,2));
    }
}
public class Experiment1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius: ");
       Circle ob=new Circle(sc.nextInt());
       ob.area();

    }
}

