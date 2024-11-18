package core.basesyntax;

import java.util.Random;

public class Lottery {

    private final int MAX = 100;
    private Random random = new Random();
    ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        String color = colorSupplier.getRandomColor();
        int number = random.nextInt(MAX) + 1;
        return new Ball(color, number);
    }
}
