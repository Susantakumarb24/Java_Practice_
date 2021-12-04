import java.util.Scanner;

public class VarArgs {
    static int sum(int ...arr)
    {
        int sum=0;
        for(int i:arr)
        {
            sum+=i;
        }
        return sum;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("how many numbers to add: ");
        int r=sc.nextInt();
       // int r=4;
        int[] array = new int[r];
        System.out.println("Enter the numbers: ");
        for(int i=0; i<r; i++)
        {

            array[i]=sc.nextInt();
        }
        System.out.println("Sum of all numbers= "+sum(array));
    }
}
