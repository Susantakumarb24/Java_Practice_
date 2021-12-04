import java.util.Scanner;
public class SphereVolume {
    public static void main(String[] args) {
        double r, pi, vol;
        pi = 3.14285714286;
        System.out.print("Enter radius of the sphere:");
        Scanner a = new Scanner(System.in);
        r = a.nextInt();
        vol = (4.0 / 3.0) * pi * (r * r * r);
        System.out.print("Volume= " + vol);

    }
}
