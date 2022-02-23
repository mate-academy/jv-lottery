package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {
    private Random random = new Random();

    public Ball getRandomBall() {
        int randomNumber = (random.nextInt(100));
        String randomColor = getRandomColor();
        Ball ball = new Ball(randomColor, randomNumber);
        return ball;
    }
}
