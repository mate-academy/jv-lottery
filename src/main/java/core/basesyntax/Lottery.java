package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {
    private final Random random = new Random();

    public Ball getRandomBall() {
        int maxValueOfRandomDigit = 100;
        return new Ball(getRandomColor(),random.nextInt(maxValueOfRandomDigit));
    }
}

