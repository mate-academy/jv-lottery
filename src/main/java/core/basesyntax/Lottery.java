package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {
    private ColorSupplier randomColor = new ColorSupplier();
    private Ball randomBall = new Ball();

    public String getRandomBall() {

        String color = randomBall.getColor();
        color = randomColor.getRandomColor();
        Random random = new Random();
        int number = randomBall.getNumber();
        number = random.nextInt(100);
        String numberToString = Integer.toString(number);
        return color + ", " + numberToString;
    }
}
