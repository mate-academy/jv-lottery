package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static Ball getRandomBall() {
        ColorSupplier color = new ColorSupplier();
        Random random = new Random();
        int number = random.nextInt(100);
        return new Ball(color.getRandomColor(), number);
    }
}
