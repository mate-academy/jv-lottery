package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        int randomNumber = new Random().nextInt(100);
        String randomColor = ColorSupplier.getRandomColor();
        Ball ball = new Ball(randomColor,randomNumber);
        return ball;
    }
}
