import java.util.Scanner;

public class Palindrome2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str=sc.nextLine();
        int k=1,n=str.length()-1;
        for(int i=0;i<n/2;i++)
        {
            if(str.charAt(i)!=str.charAt(n-i))
            {
                k=0;
                break;
            }
        }
        if(k==1)
            System.out.println("it is palindrome");
        else
            System.out.println("noot ");

    }
}
