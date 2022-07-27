package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        String randomBallColor = new ColorSupplier().getRandomColor();
        int randomBallNumber = new Random().nextInt(100);
        return new Ball(randomBallColor, randomBallNumber);
    }
}
