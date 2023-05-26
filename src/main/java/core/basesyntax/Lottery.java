package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Ball randomBall = new Ball();
        Random random = new Random();
        randomBall.setNumber(random.nextInt(Ball.MAX_NUMBER));
        int index = random.nextInt(Color.values().length);
        randomBall.setColor(new ColorSupplier().getRandomColor());
        return randomBall;
    }
}
