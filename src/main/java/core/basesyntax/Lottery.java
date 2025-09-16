package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static Ball getRandomBall() {
        Random random = new Random();
        int number = random.nextInt(101);
        ColorSupplier color = new ColorSupplier();
        return new Ball(color.getRandomColor(), number);
    }
}
