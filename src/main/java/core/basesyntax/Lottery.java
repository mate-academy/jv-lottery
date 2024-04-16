package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final ColorSupplier colorSupplier;
    public Lottery() {
        this.colorSupplier = new ColorSupplier();
    }

    public Ball getRandomBall() {
        final Colors randomColor = colorSupplier.getRandomColor();
        final Random randomNumber = new Random();
        final int randomBall = randomNumber.nextInt(101);
        return new Ball(randomColor, randomBall);
        }
    }
