package core.basesyntax;

import java.util.Random;

public class Lottery {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private int maxValue = 100;
    private Random random = new Random();

    public Ball getRandomBall() {
        int number = random.nextInt(maxValue);
        String color = colorSupplier.getRandomColor();
        return new Ball(color, number);
    }
}
