package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {

    public Ball getRandomBall() {
        Random random = new Random();
        return new Ball(random.nextInt(100) + 1, getRandomColor());
    }
}
