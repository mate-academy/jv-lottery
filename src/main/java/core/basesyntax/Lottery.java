package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {
    public static Ball getRandomBall() {
        Random random = new Random();
        int randomNumber = random.nextInt(10);
        ColorSupplier supplier = new ColorSupplier();
        supplier.getRandomColor();
        Ball ball = new Ball();
        ball.setNumber(randomNumber);
        ball.setColor(supplier.getRandomColor().name());
        return ball;
    }
}
