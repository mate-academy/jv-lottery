package core.basesyntax;

import java.util.Random;

public class Lottery {

    public Ball getRandomBall() {
      ColorSupplier color = new ColorSupplier();
        String colorBall = color.getRandomColor();
        Random random = new Random();
        int numberBall = random.nextInt(100);
        Ball ball = new Ball();
        ball.setBall(colorBall, numberBall);
        return ball;
    }
}
