package core.basesyntax;

import java.util.Random;

public class Lottery {
    public String getRandomBall() {
        Ball ball = new Ball();
        ColorSupplier color = new ColorSupplier();
        ball.setNumber(new Random().nextInt(100));
        ball.setColor(color.getRandomColor());
        return ball.toString();
    }
}
