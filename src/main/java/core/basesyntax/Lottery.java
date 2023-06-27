package core.basesyntax;

import java.util.Random;

public class Lottery {
    Random random = new Random();
    ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Color randomColor = colorSupplier.getRandomColor();
        int randomNumber = random.nextInt(100);
        return new Ball(randomColor, randomNumber);
    }
}
