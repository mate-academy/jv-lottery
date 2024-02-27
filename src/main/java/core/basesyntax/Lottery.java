package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {
    public String getRandomBall() {
        final int  ballIndex = new Random().nextInt(100);
        Ball ball = new Ball(getRandomColor(), ballIndex);
        return ball.toString();
    }
}
