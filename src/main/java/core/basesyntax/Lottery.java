package core.basesyntax;

import java.util.Random;

public class Lottery {

    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        String color = colorSupplier.getRandomColor().toString();
        int number = getRandomNumber();
        Ball ball = new Ball();
        ball.setColor(color);
        ball.setNumber(number);
        return ball;
    }

    public int getRandomNumber() {
        return new Random().nextInt(100);
    }
}
