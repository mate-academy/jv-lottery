package core.basesyntax;

import java.util.Random;

public class Lottery {
    static final int MAXIMUM_NUMBER_OF_BALL = 100;
    private static Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public static int randomNumber(int number) {
        int randomnumber = random.nextInt(number);
        return randomnumber;
    }

    public Ball getRandomBall() {
        int number = Lottery.randomNumber(MAXIMUM_NUMBER_OF_BALL);
        String color = colorSupplier.getRandomColor();
        return new Ball(number,color);
    }
}
