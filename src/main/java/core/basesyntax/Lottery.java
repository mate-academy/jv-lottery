package core.basesyntax;

import java.util.Random;

public class Lottery {

    private final int maxBallValue; // i`m not sure, it`s would be better to make this a constant?

    public Lottery() {
        maxBallValue = 101;
    }

    public Ball getRandomBall() {
        return new Ball(new Random().nextInt(maxBallValue), new ColorSupplier().getRandomColor());
    }
}
