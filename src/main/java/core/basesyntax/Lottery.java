package core.basesyntax;

import java.util.Random;

public class Lottery {
    public String getRandomBall() {
        Ball ball = new Ball();
        ColorSupplier colorSupplier = new ColorSupplier();
        colorSupplier.getRandomColor(ball);
        int randomValue = new Random().nextInt(100);
        ball.setNumber(randomValue);
        return ball.getColor() + " " + ball.getNumber();
    }
}
