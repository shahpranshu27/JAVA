import java.util.Random;
public class RandomNumber {
    public static void main(String[] args) {
        Random random = new Random();

        int x = random.nextInt(100);
        System.out.println(x);
        int y = random.nextInt(1000);
        System.out.println(y);

        double a = random.nextDouble();
        System.out.println(a);

        float b = random.nextFloat();
        System.out.println(b);

        long c = random.nextLong();
        System.out.println(c);

        boolean d = random.nextBoolean();
        System.out.println(d);
    }
}
