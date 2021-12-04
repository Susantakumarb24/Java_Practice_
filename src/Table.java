import java.util.Scanner;

 class Table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Which table you want Enter: ");
        int n=sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.printf("%d * %d = %d\n",n,i,n*i);
        }
    }
}
