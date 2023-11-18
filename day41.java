import java.util.Random;
public class day41 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        System.out.println("Angka acak: " + randomNumber);
    }
}