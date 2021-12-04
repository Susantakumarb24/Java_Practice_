
import java.util.Scanner;
 //Scanner sc=new Scanner(System.in);
class Students{
    //private:
    Scanner sc=new Scanner(System.in);
    int roll;
    String name;
    String classs;
    void setData()
    {
        System.out.println("enter ur roll:");
        roll=sc.nextInt();
        sc.nextLine();
        System.out.println("enter ur name:");
        name=sc.nextLine();
        System.out.println("Enter ur class:");
        classs=sc.nextLine();
    }
    void display()
    {
        System.out.println("Name: "+name);
        System.out.println("Roll No: "+roll);
        System.out.println("Class: "+classs);
    }
}



public class Example {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Students s1=new Students();
        Students s2=new Students();
        //System.out.println(s1.roll+" "+s1.name);
        s1.setData();
        s2.setData();
        s1.display();
        System.out.println(s2.name);
        System.out.println(s2.roll);
        System.out.println(s2.classs);
    }
}
