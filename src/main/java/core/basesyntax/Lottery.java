package core.basesyntax;

import java.util.Random;

public class Lottery {
    private ColorSupplier color;
    private Random random;
    private int bound = 100;

    public Lottery() {
        this.color = new ColorSupplier();
        this.random = new Random();
    }

    public Ball getRandomBall() {
        int value = random.nextInt(bound);
        return new Ball(color.getRandomColor(), value);
    }
}
