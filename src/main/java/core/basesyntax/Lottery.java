package core.basesyntax;

import java.util.Random;

public class Lottery {
    Random random = new Random();
    final int maxNumber = 100;

    public Ball getRandomBall() {
        String color = new ColorSupplier().getRandomColor();
        int numberRandom = random.nextInt(maxNumber);
        return new Ball(color, numberRandom);
    }
}
