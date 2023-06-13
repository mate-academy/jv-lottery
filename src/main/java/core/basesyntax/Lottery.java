package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {
    private static int MAX_NUMBER = 100;
    private String ballColor;
    private int numberOfBall;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    Ball getRandomBall() {
        ballColor = colorSupplier.getRandomColor();
        numberOfBall = random.nextInt(MAX_NUMBER);
        return new Ball(ballColor, numberOfBall);
    }
}
