package core.basesyntax;

import java.util.Random;

class Lottery {
    public Ball getRandomBall() {
        Random random = new Random();
        Color color = new ColorSupplier().getRandomColor();
        int number = random.nextInt(101);
        return new Ball(color, number);
    }
}
