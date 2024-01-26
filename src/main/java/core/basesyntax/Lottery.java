package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static Ball getRandomBall() {
        int ballNumber = new Random().nextInt(100) + 1;
        ColorSupplier ballColor = new ColorSupplier();
        return new Ball(ballColor.getRandomColor(), ballNumber);
    }
}
