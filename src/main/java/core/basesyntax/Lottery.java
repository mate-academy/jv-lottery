package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {

    private static int NUMBER_INDEX = 100;
    private ColorSupplier randomColor = new ColorSupplier();

    public String getRandomBall() {

        Ball randomBall = new Ball();
        String color = randomBall.getColor();
        color = randomColor.getRandomColor();
        Random random = new Random();
        int number = randomBall.getNumber();
        number = random.nextInt(NUMBER_INDEX) + 1;
        String numberToString = Integer.toString(number);
        return color + ", " + numberToString;
    }
}
