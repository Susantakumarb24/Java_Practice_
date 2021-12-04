import java.io.FileOutputStream;
import java .util.Scanner;
public class FileHandling {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            FileOutputStream ob=new FileOutputStream("D:\\FileHandlingEX\\first.txt");
            System.out.println("Enter string");
            String str=sc.nextLine();
            byte b[]=str.getBytes();
            ob.write(b);
            ob.write(65);
            ob.close();
            System.out.println("success...");
        }catch(Exception e){System.out.println(e);}
    }

}
