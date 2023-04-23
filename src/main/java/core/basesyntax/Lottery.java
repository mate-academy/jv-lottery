package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        int ballCount = 100;
        return new Ball(new ColorSupplier().getRandomColor(), new Random().nextInt(ballCount));
    }
}
