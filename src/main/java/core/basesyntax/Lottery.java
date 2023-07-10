package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Ball ball = new Ball();
        ColorSupplier colSup = new ColorSupplier();
        ball.setColor(colSup.getRandomColor());
        Random rand = new Random();
        ball.setNumber(rand.nextInt(100));
        return ball;
    }

}
