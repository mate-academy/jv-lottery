package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        String color1 = colorSupplier.getRandomColor().toString();
        int number1 = getRandomNumber();
        Ball ball = new Ball();
        ball.setColor(color1);
        ball.setNumber(number1);
        return ball;
    }

    public int getRandomNumber() {
        return new Random().nextInt(100);
    }
}

