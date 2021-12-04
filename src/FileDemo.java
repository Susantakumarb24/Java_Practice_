import java.io.*;
//import java.io.IOException;
//import java.io.IOException;
import java.util.Scanner;

public class FileDemo {
    Scanner ss = new Scanner(System.in);
        void listUpdate() {
            try {
           /* System.out.println("enter file name:");
            BufferedWriter br=new BufferedWriter(new FileWriter(ss.nextLine()));
            System.out.println("Enter content:");
            br.write(ss.nextLine());
            System.out.println("new content:");
            br.write(ss.nextLine());
            // br.append('k');
            br.close();*/

               /* System.out.println("enter file to add: ");
                BufferedWriter out = new BufferedWriter(
                        new FileWriter(ss.nextLine(), true));
                System.out.println("Name: ");
                out.write("\nName:" + ss.nextLine());
                System.out.println("Enter roll:");
                out.write("\nRoll: " + ss.nextLine() + "\n\n");
                out.close();*/
                BufferedReader br=new BufferedReader(new FileReader(ss.nextLine()));
                String str;
                while ((str = br.readLine()) != null) {
                    System.out.println(str);
                }


            } catch (Exception e) {
                //e.printStackTrace();
            }

        }
    void show()
    {
        Scanner sc = new Scanner(System.in);
        try {
            BufferedReader in = new BufferedReader(
                    new FileReader("susa.txt"));
          //  System.out.println("Enter name: ");
          //  String str=sc.nextLine();



        }
        catch (IOException e) {
            System.out.println("Exception Occurred" + e);
        }
    }
    public static void main(String[] args) {
            FileDemo ob=new FileDemo();

           // ob.show();
            ob.listUpdate();


}}

