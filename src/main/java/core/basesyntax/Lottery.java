package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final ColorSupplier newcolor = new ColorSupplier();
    private final Random random = new Random();
    private final int maxvalue = 100;

    public Ball getRandomBall() {
        String color = newcolor.getRandomColor();
        int number = random.nextInt(maxvalue) + 1;
        return new Ball(color, number);
    }
}
