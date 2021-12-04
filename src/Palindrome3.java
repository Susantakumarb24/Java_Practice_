import java.util.Scanner;

public class Palindrome3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str=sc.nextLine();
        StringBuilder rev1=new StringBuilder(str);
        rev1.reverse();
        String rev= rev1.toString();
        System.out.println(rev);
        if(str.equals(rev))
            System.out.println("it is palindrome");
        else
            System.out.println("not ");

    }
}