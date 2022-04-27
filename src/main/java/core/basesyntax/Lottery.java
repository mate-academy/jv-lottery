package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        ColorSupplier cc = new ColorSupplier();
        int nn = new Random().nextInt(100);
        Ball randBall = new Ball(nn, cc.getRandomColor());
        return randBall;
    }
}
