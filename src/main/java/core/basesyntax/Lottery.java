package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random random = new Random();

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    public Ball getRandomBall() {
        ColorSupplier supplier = new ColorSupplier();
        String color = supplier.getRandomColor();
        int number = getRandom().nextInt(100);
        return new Ball(color, number);
    }
}
