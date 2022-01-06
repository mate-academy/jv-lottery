package core.basesyntax;

import java.util.Random;

public class Lottery extends Ball{
    public Ball getRandomBall(){
        Ball ball = new Ball();
        Random random = new Random();
        ColorSupplier colour = new ColorSupplier();
        ball.color = colour.getRandomColor().toString();
        ball.number = random.nextInt(100);
        return ball;
    }
}