package core.basesyntax;

import ball.characteristics.Ball;
import java.util.Random;

public class Lottery {
    public static String getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(ColorSupplier.getRandomColor());
        ball.setNumber(new Random().nextInt(100));
        return "Ball color is " + ball.getColor() + " and the number is " + ball.getNumber();
    }
}
