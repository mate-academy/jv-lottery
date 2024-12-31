package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Ball ball = new Ball();
        ColorSupplier colorSupplier = new ColorSupplier(); // Create a ColorSupplier object
        Colors randomColor = colorSupplier.getRandomColor();
        ball.setColor(randomColor);
        int randomValue = new Random().nextInt(100);
        ball.setNumber(randomValue);
        return ball;
    }
}
