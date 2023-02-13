package core.basesyntax;

import java.util.Random;

public class Lottery {

    public Ball getRandomBall() {
        final String color = ColorSupplier.getRandomColor();
        final int index = new Random().nextInt(100);
        return new Ball(color, index);

    }
}
