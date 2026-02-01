package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_BOUND = 101;
    private ColorSupplier color = new ColorSupplier();
    private Random rand = new Random();

    public Lottery() {
    }

    public Ball getRandomBall() {
        int num = rand.nextInt(MAX_BOUND);
        return new Ball(color.getRandomColor(), rand.nextInt(MAX_BOUND));

    }

}
