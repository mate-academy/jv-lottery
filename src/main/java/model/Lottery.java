package model;

import core.basesyntax.ColorSupplier;

public class Lottery {

    private static final int MAX_NUMBER = 100;
    private final ColorSupplier colorSupplier;

    public Lottery() {
        this.colorSupplier = new ColorSupplier();
    }

    public ColorSupplier getColorSupplier() {
        return this.colorSupplier;
    }

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), colorSupplier.getRandom()
                .nextInt(MAX_NUMBER + 1));
    }
}
