package core.basesyntax;

import static core.basesyntax.ColorSupplier.getRandomColor;

import java.util.Random;

public class Lottery {
    public static Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(getRandomColor());
        ball.setNumber(new Random().nextInt(100));
        return ball;
    }
}
