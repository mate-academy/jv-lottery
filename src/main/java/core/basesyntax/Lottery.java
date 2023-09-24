package core.basesyntax;

import java.util.Random;

public class Lottery {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public String getRandomBall() {
        int randomInt = random.nextInt(101);
        Ball ball = new Ball(colorSupplier.getRandomColor(), randomInt);
        return ball.toString();
    }
}
