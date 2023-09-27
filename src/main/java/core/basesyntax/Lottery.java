package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random random = new Random();

    public Ball getRandomBall() {
        int ballNumber = random.nextInt(100); // Генерує випадковий номер кулі
        Ball ball = new Ball(ballNumber);
        ColorSupplier colorSupplier = new ColorSupplier();
        ball.setColor(colorSupplier.getRandomColor());
        return ball;
    }
}
