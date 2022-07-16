package core.basesyntax;

import java.util.Random;

public class Lottery {

    public static Ball getRandomBall() {
    Ball ball = new Ball();
    ball.number = new Random().nextInt(100);
    ball.color = ColorSupplier.getRandomColor();
    return ball;
    }
}
