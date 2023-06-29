package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Random random = new Random();
        ColorSupplier color = new ColorSupplier();
        int randomNumber = random.nextInt(100);
        Colors randomColor = color.getRandomColor();

        return new Ball(randomColor, randomNumber);
    }
}
