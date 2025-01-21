package core.basesyntax;

import java.awt.*;
import java.util.Random;

public class Lottery {
    private final ColorSupplier colorSupplier;

    public Lottery(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }
    public Ball getRandomBall() {
        String randomColor = colorSupplier.getRandomColor();
        Random random = new Random();
        int randomNumber = random.nextInt(101);
        return new Ball(randomColor, randomNumber);
    }

}