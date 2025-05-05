package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER = 99;

    public Ball getRandomBall() {
        int numberOfBall = new Random().nextInt(MAX_NUMBER);
        String color = new ColorSupplier().getRandomColor();
        return new Ball(color, numberOfBall);
    }
}
