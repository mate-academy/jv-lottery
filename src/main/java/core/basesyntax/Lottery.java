package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {
    public static Ball getRandomBall() {
        Random random = new Random();
        return new Ball(getRandomColor(), random.nextInt(101));
    }
}
