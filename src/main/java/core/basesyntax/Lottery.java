package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {
    private static final Integer MAX_BALL_VALUE = new Random().nextInt(100);

    public String getRandomBall() {
        return "Color: "
                + getRandomColor()
                + " Number: "
                + MAX_BALL_VALUE;
    }

    @Override
    public String toString() {
        return "Ball{"
                + "color='"
                + getRandomColor()
                + '\''
                + ", number="
                + MAX_BALL_VALUE
                + '}';
    }
}
