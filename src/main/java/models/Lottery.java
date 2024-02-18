package models;

import core.basesyntax.ColorSupplier;

public class Lottery {
    private static final int MAX_BALL_NUMBER = 100;

    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        String color = colorSupplier.getRandomColor();
        int ballNumber = colorSupplier.getRandom().nextInt(MAX_BALL_NUMBER);
        return new Ball(color, ballNumber);
    }
}
