package core.basesyntax;

import java.util.Random;

public class Lottery {
    private ColorSupplier color = new ColorSupplier();
    private Random random = new Random();
    private static final int MAX_NUMBER_BALL = 101;

    public String getRandomBall() {
        int num = random.nextInt(MAX_NUMBER_BALL);
        String col = color.getRandomColor();
        return num + " " + col;
    }

}
