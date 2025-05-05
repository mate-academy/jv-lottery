package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random randNumber = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        String color = colorSupplier.getRandomColor();
        int number = randNumber.nextInt(100) + 1;
        Ball ball = new Ball();
        ball.setColor(color);
        ball.setNumber(number);
        return ball;
    }
}
