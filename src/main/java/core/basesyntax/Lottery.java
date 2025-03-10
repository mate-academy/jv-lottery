package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {
    public Ball getRandomBall() {
        ColorSupplier color = new ColorSupplier();
        String randomColor = color.getRandomColor();
        int randomNumber = new Random().nextInt(101);
        return new Ball(randomColor, randomNumber);
    }
}
