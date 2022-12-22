package core.basesyntax;

import java.util.Random;

public class Lottery extends Ball {
    public Ball getRandomBall() {
        Ball ball = new Ball();
        ColorSupplier colorSupplier = new ColorSupplier();
        String colorRandom = colorSupplier.getRandomColor();
        int number = new Random().nextInt(100);
        ball.setColor(colorRandom);
        ball.setNumber(number);
        return ball;
    }
}
