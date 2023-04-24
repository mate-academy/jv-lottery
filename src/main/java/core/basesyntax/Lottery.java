package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random random = new Random();

    public Ball getRandomBall() {
        int value = random.nextInt(100);
        ColorSupplier color = new ColorSupplier();
        String randomColor = color.getRandomColor();
        return new Ball(randomColor,value);
    }
}
