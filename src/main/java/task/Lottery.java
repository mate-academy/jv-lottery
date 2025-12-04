package task;

import java.util.Random;
import task.Ball.Color;

public class Lottery {

    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Ball getRandomBall() {
        Color color = colorSupplier.getRandomColor();
        int number = random.nextInt(100) + 1;
        Ball ball = new Ball(color, number);
        return ball;
    }
}
