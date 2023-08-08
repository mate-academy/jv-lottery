import java.util.Random;

public class Lottery {
    public String getRandomBall() {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        return "We have such a ball: " + new ColorSupplier().getRandomColor() + " " + randomNumber;
    }
}
