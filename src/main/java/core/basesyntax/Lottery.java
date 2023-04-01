package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random random = new Random();
    private ColorSupplier csp = new ColorSupplier();
    private final int maxNumber = 100;

    public Ball getRandomBall() {
        Ball ball = new Ball();
        int number = random.nextInt(maxNumber);
        ball.setNumber(number);
        ball.getNumber();
        String color = csp.getRandomColor();
        ball.setColor(color);
        ball.getColor();
        return ball;
    }
}
