package core.basesyntax;

import java.util.Random;

public class Lottery {
    ColorSupplier color = new ColorSupplier();
    Random random = new Random();
    public Ball getRandomBall() {
        return new Ball(color.getRandomColor(),random.nextInt(1, 101));
    }
}
