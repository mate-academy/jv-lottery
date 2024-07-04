package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Object getRandomBall() {
        Ball ball = new Ball();
        String randomColor = new ColorSupplier().getRandomColor();
        ball.setColor(randomColor);
        ball.setNumber(new Random().nextInt(100));
        return ball;
    }
}
