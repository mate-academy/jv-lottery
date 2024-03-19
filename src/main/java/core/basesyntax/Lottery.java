package core.basesyntax;

import java.util.Random;

public class Lottery {

    public Ball getRandomBall() {
        int numberOfBall = new Random().nextInt(99);
        String color = new ColorSupplier().getRandomColor();
        return new Ball(color, numberOfBall);
    }
}
