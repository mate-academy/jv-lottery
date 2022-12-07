package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static final int maxBallNum = 100;

    public Ball getRandomBall() {
        int randomNumber = new Random().nextInt(maxBallNum + 1);
        String randomColor = new ColorSupplier().getRandomColor();
        return new Ball(randomNumber, randomColor);
    }
}
