package core.basesyntax;

import java.util.Random;

public class Lottery {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Ball getRandomBall() {
        int number = random.nextInt(100);
        Colors colors = colorSupplier.randomColor();
        String color = colors.toString();
        Ball ball = new Ball(color, number);
        return ball;
    }
}
