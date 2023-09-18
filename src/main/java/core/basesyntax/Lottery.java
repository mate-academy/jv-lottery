package core.basesyntax;

import java.util.Random;

public class Lottery {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Ball getRandomBall() {
        String randomColor = getRandomColor();
        int randomNumber = getRandomNumber();

        Ball ball = new Ball(randomColor, randomNumber);
        return ball;
    }

    private int getRandomNumber() {
        return random.nextInt(101);
    }

    private String getRandomColor() {
        return colorSupplier.getRandomColor();
    }
}
