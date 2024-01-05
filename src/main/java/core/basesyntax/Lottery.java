package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER_BALL = 101;
    private ColorSupplier color = new ColorSupplier();
    private Random random = new Random();

    public String getRandomBall() {
        int num = random.nextInt(MAX_NUMBER_BALL);
        String col = color.getRandomColor();
        return num + " " + col;
    }

}
