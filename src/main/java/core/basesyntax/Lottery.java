package core.basesyntax;

import java.util.Random;

class Lottery {
    private static final int MAX_NUMBER = 100;
    private ColorSupplier colorSupplier;
    private Random random;

    public Lottery() {
        this.colorSupplier = new ColorSupplier();
        this.random = new Random();
    }

    public Ball getRandomBall() {
        Color color = colorSupplier.getRandomColor();
        int number = random.nextInt(MAX_NUMBER) + 1;
        return new Ball(color, number);
    }
}
