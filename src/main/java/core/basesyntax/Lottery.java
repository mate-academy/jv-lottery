package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random random = new Random();
    private final Color randomColor = new ColorSupplier().getRandomColor();
    private final int randomNumber = random.nextInt(100) + 1;

    public String getRandomBall() {
        return new Ball(randomColor, randomNumber).toString();
    }
}
