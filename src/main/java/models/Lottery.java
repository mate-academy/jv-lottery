package models;

import core.basesyntax.ColorSupplier;
import java.util.Random;

public class Lottery {
    private static final int RANGE = 100;
    private ColorSupplier colorSupplier;
    private int ballNumber;

    public Ball getRandomBall() {
        this.colorSupplier = new ColorSupplier();
        String color = colorSupplier.getRandomColor();
        this.ballNumber = new Random().nextInt(RANGE);
        return new Ball(color, this.ballNumber);
    }
}
