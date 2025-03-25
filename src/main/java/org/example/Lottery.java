package org.example;

import java.util.Random;

public class Lottery {
    private static final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        String randomColor = colorSupplier.getRandomColor();
        int randomNumber = random.nextInt(100) + 1; // Random number between 1 and 100
        return new Ball(randomColor, randomNumber);
    }
}


