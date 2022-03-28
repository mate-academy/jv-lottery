package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final Integer RANDOM_BOUND = 100;
    protected Random random = new Random();
    private ColorSupplier color = new ColorSupplier();

    public String getRandomBall() {
        int numb = random.nextInt(RANDOM_BOUND);
        Ball ball = new Ball();
        ball.setColor(color.getRandomColor());
        ball.setNumber(numb);
        return ball.toString(ball.getColor(), ball.getNumber());
    }
}
