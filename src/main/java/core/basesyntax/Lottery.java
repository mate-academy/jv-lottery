package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final Random random = new Random();

    public Ball getRandomBall() {
        Color randomColor = ColorSupplier.getRandomColor();
        int randomNumber = random.nextInt(100) + 1;
        return new Ball(randomColor.toString(), randomNumber);
    }
}
