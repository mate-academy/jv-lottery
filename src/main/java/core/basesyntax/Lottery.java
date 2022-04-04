package core.basesyntax;

import java.util.Random;

public class Lottery {
    static final int BOUND = 100;
    private final Random randomNumber = new Random();
    ColorSupplier randomColor = new ColorSupplier();

    public Ball getRandomBall() {
        String color = randomColor.getRandomColor();
        int number = randomNumber.nextInt(BOUND);
        return new Ball(color, number);
    }
}
