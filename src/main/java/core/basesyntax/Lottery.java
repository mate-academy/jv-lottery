package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        int numBall = new Random().nextInt(100);
        String colorBall = new ColorSupplier().getRandomColor();
        return new Ball(colorBall, numBall);
    }
}
