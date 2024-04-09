package core.basesyntax;

import java.util.Random;

public class Lottery extends Ball {
    private static final int MAX_NUMBER = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        String color = colorSupplier.getRandomColor();
        int number = random.nextInt(MAX_NUMBER);
        Ball newBall = new Ball();
        newBall.setColor(color);
        newBall.setNumber(number);
        return newBall;
    }
}
