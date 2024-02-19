package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {
    public Ball getRandomBall() {
        int randomInt = new Random().nextInt(100);
        return new Ball(new ColorSupplier().getRandomColor(),randomInt);
    }
}
