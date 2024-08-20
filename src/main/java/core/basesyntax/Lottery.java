package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final int maxNumber = 100;

    public Ball getRandomBall() {
        Random rnd = new Random();
        int number = rnd.nextInt(maxNumber);
        String color = ColorSupplier.getRandomColor();
        return new Ball(color, number);
    }
}
