package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall(){
        Ball ball = new Ball();
        ball.setColor(new ColorSupplier().getRandomColor().toString());
        ball.setNumber(new Random().nextInt(100));

        return ball;
    }
}
