package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        ColorSupplier randomColor = new ColorSupplier();
        int randomNumber = new Random().nextInt(100) + 1;
        Ball ball = new Ball(randomColor.getRandomColor(), randomNumber);

        return ball;
    }
}
