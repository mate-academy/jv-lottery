package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall(){
        Ball ball = new Ball();
        ball.setColor(new ColorSupplier().getRandomColor());
        Random random = new Random(100);
        ball.setNumber(random.nextInt());
        return ball;
    }
}
