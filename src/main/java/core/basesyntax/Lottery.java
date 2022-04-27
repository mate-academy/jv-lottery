package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        ColorSupplier randomColor = new ColorSupplier();
        Ball ball = new Ball();
        ball.setColors(randomColor.getRandomColor().name());
        ball.setNumbers(new Random().nextInt(100));
        return ball;
    }
}


