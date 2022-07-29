package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Color randCol = colorSupplier.getRandomColor();
        int randNum = new Random().nextInt(100);
        Ball ball = new Ball(randCol, randNum);
        return ball;
    }
}
