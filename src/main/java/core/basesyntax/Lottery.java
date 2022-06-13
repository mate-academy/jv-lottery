package core.basesyntax;

import java.util.Random;

public class Lottery {
    static final int MAXIMUM_NUMBER_OF_BALL = 100;
    public static Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    private int number = random.nextInt(MAXIMUM_NUMBER_OF_BALL);
    private String color = colorSupplier.getRandomColor();
    public Ball getRandomBall() {
        return new Ball(number,color);
    }
}
