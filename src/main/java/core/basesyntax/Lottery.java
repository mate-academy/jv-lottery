package core.basesyntax;

import java.util.Random;

public class Lottery {
    public String getRandomBall() {
        Ball ball = new Ball();
        ColorSupplier colorSupplier = new ColorSupplier();
        ball.setColor(colorSupplier.getRandomColor().toString());
        ball.setNumber(new Random().nextInt(100));
        return ball.toString();
    }
}
