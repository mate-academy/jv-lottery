package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {

    private static int NUMBER_INDEX = 100;
    private final ColorSupplier randomColor = new ColorSupplier();
    private final Random random = new Random();

    public String getRandomBall() {

        Ball randomBall = new Ball();
        String color = randomBall.getColor();
        color = randomColor.getRandomColor();
        int number = randomBall.getNumber();
        number = random.nextInt(NUMBER_INDEX) + 1;
        return color + ", " + number;
    }
}
