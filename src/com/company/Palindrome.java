
package com.company;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        double start=System.currentTimeMillis();
        long beforeUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
        int temp,rem,rev=0;
        System.out.println("Enter a number:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        temp=num;
        while(num!=0)
        {
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        if(temp==rev)
        {
            System.out.println("it is palindrome");
        }
        else
            System.out.println("not Palindrome");
        System.out.println("Time Taken: "+(System.currentTimeMillis()-start));

        long afterUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
        System.out.println(afterUsedMem-beforeUsedMem);
    }

}
