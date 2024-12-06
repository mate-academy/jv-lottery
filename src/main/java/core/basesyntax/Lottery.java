package main.java.core.basesyntax;

import core.basesyntax.Ball;
import core.basesyntax.ColorSupplier;

import java.util.Random;

public class Lottery {

    private static final int MAX_NUMBER = 100;

    private final Random random = new Random();

    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();

        String randomColor = colorSupplier.getRandomColor();

        int randomNumber = random.nextInt(MAX_NUMBER) + 1;

        return new Ball(randomColor, randomNumber);
    }
}