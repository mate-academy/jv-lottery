package models;

import core.basesyntax.ColorSupplier;
import java.util.Random;

public class Lottery {
    public static Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        String color = colorSupplier.getRandomColor();
        int number = new Random().nextInt(100);
        return new Ball(color, number);
    }
}
