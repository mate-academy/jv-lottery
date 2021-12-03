package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        int number;
        number = random.nextInt(100);
        String difColors = colorSupplier.getRandomColor();
        return new Ball(number, difColors);
    }
}

