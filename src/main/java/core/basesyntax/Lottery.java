package core.basesyntax;

import java.util.Random;

public class Lottery {

    private static final int RANDNUMBER = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        int randomNumber = random.nextInt(RANDNUMBER);
        Color randomColor = colorSupplier.getRandomColor();
        Ball ball = new Ball();
        ball.setColor(randomColor);
        ball.setNumber(randomNumber);
        return ball;
    }
}
