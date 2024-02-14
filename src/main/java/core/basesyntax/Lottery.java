package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        int number = new Random().nextInt(100);
        ColorSupplier color = new ColorSupplier();
        return new Ball(color.getRandomColor(),number);
    }
}
