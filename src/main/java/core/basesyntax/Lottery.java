package core.basesyntax;

import java.util.Random;

public class Lottery extends Ball {
    public Ball getRandomBall() {
        String randomColor = new ColorSupplier().getRandomColor();
        int randomNumber = new Random().nextInt(100);
        return new Ball(randomColor, randomNumber);
    }
}
