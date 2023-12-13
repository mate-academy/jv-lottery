package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAXIMUM_NUMBER = 100;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random randomNumber = new Random();

    public Ball getRandomBall() {
        String color = colorSupplier.getRandomColor().toString();
        int number = randomNumber.nextInt(MAXIMUM_NUMBER);
        return new Ball(color, number);
    }
}
