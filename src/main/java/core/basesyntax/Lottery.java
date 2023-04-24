package core.basesyntax;

import java.util.Random;

public class Lottery {

    private Random random;
    private ColorSupplier colorSupplier;

    public Lottery() {
        this.random = new Random();
        this.colorSupplier = new ColorSupplier();
    }

    public Ball getRandomBall() {
        String color = colorSupplier.getRandomColor().toString();
        int value = random.nextInt(100);
        return new Ball(color, value);
    }
}
