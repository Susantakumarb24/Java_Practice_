import java.lang.*;
import java.util.*;
public class StarPattern1 {
    public static void main(String[] args) {
        int i,j,row,col;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of row:");
        row=sc.nextInt();
        System.out.print("Enter number of column:");
        col=sc.nextInt();
        for(i=1;i<=row;i++)
        {
            for(j=1;j<col;j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}

