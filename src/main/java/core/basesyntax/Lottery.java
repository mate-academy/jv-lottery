package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int BOUND = 100;
    private Random random = new Random();

    public Ball getRandomBall() {
        Ball newBall = new Ball();
        newBall.setColor(new ColorSupplier().getRandomColor());
        newBall.setNumber(random.nextInt(BOUND));
        return newBall;
    }
}
