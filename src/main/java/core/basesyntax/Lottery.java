package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER_OF_BALLS = 100;

    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        String color = colorSupplier.getRandomColor();
        Random random = new Random();
        int numb = random.nextInt(MAX_NUMBER_OF_BALLS);
        return new Ball(color,numb);
    }
}
