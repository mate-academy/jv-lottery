package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        ColorSupplier color = new ColorSupplier();
        Color randomColor = color.getRandomColor();
        Random random = new Random();
        int value = random.nextInt(101);
        return new Ball(randomColor, value);
    }
}
