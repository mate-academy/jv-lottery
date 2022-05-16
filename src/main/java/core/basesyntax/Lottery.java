package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static final int BALL_NUMBER = 100;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Color color = colorSupplier.getRandomColor();
        int numb = random.nextInt(BALL_NUMBER);
        return new Ball(color, numb);
    }
}
