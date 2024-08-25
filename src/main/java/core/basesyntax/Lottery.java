package core.basesyntax;

import java.util.Random;

class Lottery {
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        int number = random.nextInt(101);
        String randomColor = String.valueOf(colorSupplier.getRandomColor());
        return new Ball(randomColor, number);
    }
}
