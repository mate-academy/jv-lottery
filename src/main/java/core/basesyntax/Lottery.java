package core.basesyntax;

import java.util.Random;

public class Lottery {

    private ColorSupplier colorSupplier;

    public Lottery() {
        this.colorSupplier = new ColorSupplier();

    }

    public Ball getRandomBall() {
        String randomColor = colorSupplier.getRandomColor();
        Random random = new Random();
        int randomInt = random.nextInt(101);
        return new Ball(randomColor, randomInt);
    }
}
