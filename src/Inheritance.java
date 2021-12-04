//import java.sql.SQLOutput;
package com.company;
import java.util.Scanner;

class Matric{
    Scanner sc=new Scanner(System.in);
    float mark;
    String roll,name;

    public void setMatric() {
        System.out.println("=>Enter Matric Details");
        System.out.println("Enter your name:");
        name=sc.nextLine();
        System.out.println("enter roll number:");
        roll=sc.nextLine();
        System.out.println("Enter Percentage  in Matric:");
        mark=sc.nextFloat();
        sc.nextLine();
    }

    public void getMatric() {
        System.out.println("\n\n~~~~Matric Details~~~~");
        System.out.println("Name: "+name);
        System.out.println("Roll No.: "+roll);
        System.out.println("Mark Obtained: "+mark+"%");

    }

}
class Chse extends Matric
 {
    float mark;
    String roll;

    public void setChse() {
        System.out.println("=>Enter +2 Details");
        System.out.println("Enter roll number:");
        roll=sc.nextLine();
        System.out.println("Enter Percentage  in +2:");
        mark=sc.nextFloat();
        sc.nextLine();
    }

    public void getChse() {
        System.out.println("\n\n~~~~+2 Details~~~~");
        System.out.println("Name: "+name);
        System.out.println("Roll No.: "+roll);
        System.out.println("Mark Obtained: "+mark+"%");
    }
}
class Graduation extends Chse
 {
    float mark;
    String roll;

    public void setGraduation() {
        System.out.println("=>Enter Graduation Details");
        System.out.println("Enter roll number:");
        roll=sc.nextLine();
        System.out.println("Enter Percentage  in Graduation:");
        mark=sc.nextFloat();
    }

    public void getGraduation() {
        System.out.println("\n\n~~~~Graduation Details~~~~");
        System.out.println("Name: "+name);
        System.out.println("Roll No.: "+roll);
        System.out.println("Mark Obtained: "+mark+"%");
    }
}

public class Inheritance extends Graduation{
    public static void main(String[] args) {
     Inheritance s1=new Inheritance();
     s1.setMatric();
     s1.setChse();
     s1.setGraduation();
     s1.getMatric();
     s1.getChse();
     s1.getGraduation();

    }
}
