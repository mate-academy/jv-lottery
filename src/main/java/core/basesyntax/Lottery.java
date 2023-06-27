package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int BALL_NUMBER_MAX_VALUE = 100;

    public Ball getRandomBall() {
        Color color = Color.valueOf(new ColorSupplier().getRandomColor());
        return new Ball(color,new Random().nextInt(BALL_NUMBER_MAX_VALUE));
    }
}
