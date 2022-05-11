package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAXNUMBER = 100;
    private Random random = new Random();


    public Ball getRandomBall() {
        int index = random.nextInt(Color.values().length);
        Ball ball = new Ball();
        ColorSupplier colorSupplier = new ColorSupplier();
        ball.setNumber(random.nextInt(MAXNUMBER));
        ball.setColor(String.valueOf(Color.values()[index]));
        return ball;
    }
}
