import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        Random rand=new Random();
        System.out.printf("%04d", rand.nextInt(10000));
    }
}
