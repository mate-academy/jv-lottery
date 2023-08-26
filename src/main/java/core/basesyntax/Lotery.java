package core.basesyntax;

import java.util.Random;

public class Lotery {
    public Ball getRandomBall() {
        return new Ball(new ColorSupplier().getRandomColor(), new Random().nextInt(101));
    }
}
