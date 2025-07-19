package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random random = new Random();

    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Color randomColor = colorSupplier.getRandomColor();
        int number = random.nextInt(100) + 1;
        return new Ball(randomColor, number);

    }
}

