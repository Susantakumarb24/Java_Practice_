import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        //double start=System.currentTimeMillis();
        //long beforeUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of terms:");
        int n=sc.nextInt();
        int a=0,b=1,c=0;


        for (int i=0;i<n;i++)
        {
            System.out.println(c);
            a=b;
            b=c;
            c=a+b;
        }
        //long afterUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
        //System.out.println(afterUsedMem-beforeUsedMem);
    }
}
