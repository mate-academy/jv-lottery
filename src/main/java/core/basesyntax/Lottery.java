package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        String color = colorSupplier.getRandomColor();
        int number = new Random().nextInt(100) + 1;
        Ball randomBall = new Ball(color, number);
        return randomBall;
    }
}
