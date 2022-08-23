package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(String.valueOf(new ColorSupplier().getRandomColor()));
        ball.setNomber(new Random().nextInt(100));
        return ball;
    }
}
