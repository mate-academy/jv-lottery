package core.basesyntax;

import model.Ball;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();

        int randomNumber = new Random().nextInt(100);

        return new Ball(randomNumber ,colorSupplier.getRandomColor());
    }
}
