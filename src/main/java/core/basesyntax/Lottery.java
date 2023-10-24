package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    String getRandomBall() {
        String randomColor = colorSupplier.getRandomColor();
        int randomNumber = random.nextInt(MAX_NUMBER);
        Ball ball = new Ball(randomColor, randomNumber);
        return ball.getColor() + " " + ball.getNumber();
    }
}
