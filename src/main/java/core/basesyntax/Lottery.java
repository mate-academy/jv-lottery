package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Random randomNumber = new Random();
        ColorSupplier color = new ColorSupplier();
        return new Ball(randomNumber.nextInt(100),color.getRandomColor());
    }
}
