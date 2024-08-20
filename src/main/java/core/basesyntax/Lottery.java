package core.basesyntax;

import java.util.Random;

class Lottery {
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        String color = colorSupplier.getRandomColor();
        int number = random.nextInt(101);
        return new Ball(color, number);
    }
}
