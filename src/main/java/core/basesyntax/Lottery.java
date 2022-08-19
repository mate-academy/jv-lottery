package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Ball randomBall = new Ball();
        String randomColor = ColorSupplier.getRandomColor();
        Random random = new Random();

        randomBall.setColor(randomColor.toString());

        randomBall.setNumber(random.nextInt(100) + 1);

        return randomBall;
    }
}
