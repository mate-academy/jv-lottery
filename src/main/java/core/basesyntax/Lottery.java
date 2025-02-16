package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {
    public Ball getRamdomBall() {
        Ball ball = new Ball();
        ball.color = getRandomColor();
        ball.number = new Random().nextInt(100);
        return ball;
    }
}
