package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        ColorSupplier randomColor = new ColorSupplier();
        String color = randomColor.getRandomColor();
        Random random = new Random();
        int randomNumber = random.nextInt(100);

        return new Ball(color, randomNumber);
    }
}
