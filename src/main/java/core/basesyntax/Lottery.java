package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Object getRandomBall() {
        Random random = new Random();
        Ball ball = new Ball();
        ColorSupplier colorSupplier = new ColorSupplier();
        String randomColor = colorSupplier.getRandomColor();
        ball.setColor(randomColor);
        ball.setNumber(random.nextInt(100));
        return ball;
    }
}
