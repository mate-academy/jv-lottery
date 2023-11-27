package core.basesyntax;

import java.util.Random;

public class Lottery {
    static final int MAXIMUM_POSSIBLE_NUMBER = 100;
    private Ball ball = new Ball();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public String getRandomBall() {
        ball.setColor(colorSupplier.getRandomColor().name());
        ball.setNumber(new Random().nextInt(MAXIMUM_POSSIBLE_NUMBER));
        return ball.toString();
    }
}
