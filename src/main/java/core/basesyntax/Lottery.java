package core.basesyntax;

import java.util.Random;

public class Lottery {
    public void getRandomBall(Ball ball) {
        ball.setColor(ColorSupplier.getRandomColor());
        ball.setNumber(new Random().nextInt(100));
    }
}
