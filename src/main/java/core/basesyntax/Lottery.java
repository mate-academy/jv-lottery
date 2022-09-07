package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        int number = new Random().nextInt(100);
        String color = new ColorSupplier().getRandomColor();
        return new Ball(color, number);
    }

}
