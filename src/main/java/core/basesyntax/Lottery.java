package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random random = new Random();
    private ColorSupplier supplier = new ColorSupplier();

    public Ball getRandomBall() {
        Color newColor = supplier.getRandomColor();
        int randomNumber = random.nextInt(100);

        Ball ball = new Ball();
        ball.setColor(newColor.toString());
        ball.setNumber(randomNumber);
        return ball;
    }
}
