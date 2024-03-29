package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Random random = new Random();
        ColorSupplier supplier = new ColorSupplier();
        Color randomColor = supplier.getRandomColor();
        int randomNumber = random.nextInt(100) + 1;
        return new Ball(randomColor, randomNumber);
    }
}
