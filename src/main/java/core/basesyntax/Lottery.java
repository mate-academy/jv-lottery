package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        String newBallColor = new ColorSupplier().getRandomColor();
        int newBallNumber = new Random().nextInt(100);
        return new Ball(newBallColor, newBallNumber);
    }
}
