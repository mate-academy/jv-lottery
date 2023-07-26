import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER = 100;
    private static final Random random = new Random();

    public Ball getRandomBall() {
        Color color = Color.getRandomColor();
        int number = random.nextInt(MAX_NUMBER) + 1;
        return new Ball(color, number);
    }
}
