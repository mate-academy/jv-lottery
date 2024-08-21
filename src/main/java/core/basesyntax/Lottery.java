package core.basesyntax;

import java.util.Random;

class Lottery {
    private int maxValue = 101;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        String color = colorSupplier.getRandomColor();
        int number = random.nextInt(maxValue);
        return new Ball(color, number);
    }
}
