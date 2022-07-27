package core.basesyntax;

import java.util.Random;

public class Lottery {
    final Random rnd = new Random();
    final ColorSupplier colorSupplier = new ColorSupplier();
    final int HUNDRED = 100;

    public Ball getRandomBall() {
        String color = colorSupplier.getRandomColor();
        int number = rnd.nextInt(HUNDRED);
        return new Ball(color, number);
    }
}
