package core.basesyntax;

import java.util.Random;

public class Lottery {

    private static Random random = new Random();
    private static final int MaxNumber = 100;
    private static final int MinNumber = 1;

    public static Ball getRandomBall() {
        Color randomColor = ColorSupplier.getRandomColor();
        int randomNumber = random.nextInt(MaxNumber - MinNumber + 1) + MinNumber;
        return new Ball(randomColor, randomNumber);
    }
}
