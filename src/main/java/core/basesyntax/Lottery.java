package core.basesyntax;

import java.util.Random;

public class Lottery {
    ColorSupplier colorSupplier = new ColorSupplier();
    Random random = new Random();
    private static final int randomNumber = 100;
    public Ball getRandomBall() {
        Ball ball = new Ball();

        ball.setColor(Color.valueOf(colorSupplier.getRandomColor().name()));

        int num = random.nextInt(randomNumber);
        ball.setNumber(num);

        return ball;
    }
}
