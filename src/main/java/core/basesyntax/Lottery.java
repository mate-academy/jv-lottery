package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static final int MAX_NUMBER = 100;

    public Ball getRandomBall() {
        int number = new Random().nextInt(MAX_NUMBER);
        String color = new ColorSupplier().getRandomColor();
        return new Ball(color, number);
    }
}
