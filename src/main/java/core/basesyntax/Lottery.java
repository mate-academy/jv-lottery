package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static Ball getRandomBall() {
        final int constant = 100;
        String color = new ColorSupplier().getRandomColor();
        int number = new Random().nextInt(constant);
        return new Ball(color, number);
    }
}
