package core.basesyntax;

import java.util.Random;

class Lottery {
    private Random random = new Random();
    private Color color = new ColorSupplier().getRandomColor();

    public Ball getRandomBall() {
        int number = random.nextInt(101);
        return new Ball(color, number);
    }
}
