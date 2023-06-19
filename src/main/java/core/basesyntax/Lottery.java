package core.basesyntax;

import java.util.Random;

class Lottery {
    private Random random = new Random();

    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Color color = colorSupplier.getRandomColor();
        int number = random.nextInt(100) + 1;
        return new Ball(color, number);
    }
}
