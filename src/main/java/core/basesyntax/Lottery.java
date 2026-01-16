package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int BOUNDARY_NUMBER = 100;

    public Ball getRandomBall() {
        Random random = new Random();
        int indexColor = random.nextInt(Color.values().length);
        int randomto100 = random.nextInt(BOUNDARY_NUMBER);
        Color color = Color.values()[indexColor];
        Ball ball = new Ball();
        ball.setNumber(randomto100);
        ball.setColor(color);
        return ball;
    }
}
