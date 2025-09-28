package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        int number = random.nextInt(100); // випадкове число від 0 до 99
        String color = colorSupplier.getRandomColor(); // випадковий колір
        Ball ball = new Ball();
        ball.setColor(color);
        ball.setNumber(number);
        return ball;
    }
}
