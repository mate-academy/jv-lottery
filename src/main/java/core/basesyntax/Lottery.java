package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {
    private static final Random random = new Random();

    public static Ball getRandomBall() {
        Color randomColor = ColorSupplier.getRandomColor();
        int randomNumber = random.nextInt(100) + 1;
        return new Ball(randomColor, randomNumber);
    }

}
