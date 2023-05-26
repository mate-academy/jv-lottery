package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        ColorSupplier color = new ColorSupplier();
        int number = new Random().nextInt(100);
        return new Ball(number, color.getRandomColor());
    }
}
