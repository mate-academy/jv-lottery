package core.basesyntax;

import java.util.Random;

public class Lottery {
    public String getRandomBall() {
        Ball ball = new Ball();
        ColorSupplier colorSupplier = new ColorSupplier();
        Random random = new Random();

        ball.color = colorSupplier.getRandomColor();
        ball.number = random.nextInt(100);

        return ball.toString();
    }
}
