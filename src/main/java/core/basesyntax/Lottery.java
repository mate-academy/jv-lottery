package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final int amount = 100;

    public int getAmount() {
        return amount;
    }

    public Ball getRandomBall() {
        return new Ball(new Random().nextInt(amount),
                new ColorSupplier().getRandomColor());
    }
}
