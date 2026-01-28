package core.basesyntax;

import java.util.Random;

public class Lottery {
     Ball ball = new Ball();
     private static final int FIGURE_COUNT = 100;
     private final Random random = new Random();


    public Ball getRandomBall() {

        String randomColor = new ColorSupplier().getRandomColor();
        ball.setColor(randomColor);
        ball.setNumber(random.nextInt(FIGURE_COUNT));

        return ball;
    }
}
