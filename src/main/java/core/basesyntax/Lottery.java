package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        String color = ColorSupplier.getRandomColor().name().toLowerCase();
        int number = new Random().nextInt(100);
        return new Ball(color, number);
    }
}
