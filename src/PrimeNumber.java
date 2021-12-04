import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        short num=sc.nextShort();
        short i,flag=1;
        for(i=2;i<=Math.sqrt(num);i++)
        {
            if(num%i==0)
            {
                flag=0;
                break;
            }
        }
        if(flag==1)
            System.out.println("It is PRIME number");
        else
            System.out.println("not a Prime number");
    }
}
