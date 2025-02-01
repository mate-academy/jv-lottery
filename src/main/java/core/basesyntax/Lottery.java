package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        String color = new ColorSupplier().getRandomColor();
        int number = new Random().nextInt(100) + 1;
        return new Ball(color, number);
    }
}
