package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAXNUMBER = 100;
    private static final Random random = new Random();
    private static final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Color randomColor = colorSupplier.getRandomColor();
        int randomNumber = random.nextInt(MAXNUMBER) + 1;
        return new Ball(randomColor, randomNumber);
    }
}
