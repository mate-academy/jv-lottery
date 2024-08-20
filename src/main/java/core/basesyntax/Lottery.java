package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random random = new Random();
    ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        int maxValue = 101;
        String color = colorSupplier.getRandomColor();
        int number = random.nextInt(maxValue);
        return new Ball(color, number);
    }
}
