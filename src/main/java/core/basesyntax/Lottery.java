package core.basesyntax;

import java.util.Random;

public class Lottery {

    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    private int getRandomNumber() {
        return random.nextInt(100);
    }

    public Ball getRandomBall() {
        Ball ball = new Ball();
        Colors randomColor = colorSupplier.getRandomColor();
        ball.setColor(randomColor);
        int randomNumber = getRandomNumber();
        ball.setNumber(randomNumber);
        return ball;
    }
}