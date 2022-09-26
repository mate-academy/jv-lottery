package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        ColorSupplier cs = new ColorSupplier();
        int randomNumber = new Random().nextInt(100);
        return new Ball(cs.getRandomColor(), randomNumber);
    }
}
