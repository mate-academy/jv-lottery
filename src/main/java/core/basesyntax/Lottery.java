package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Color color = ColorSupplier.getRandomColor();
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        return new Ball(color, randomNumber);
    }
}
