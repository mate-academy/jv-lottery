package core.basesyntax;

import java.util.Random;

public class Lottery {
    ColorSupplier randomColor = new ColorSupplier();
    Random randomNumber = new Random();
    static final int BOUND = 100;

    public Ball getRandomBall() {
        String color = randomColor.getRandomColor();
        int number = randomNumber.nextInt(BOUND);
        return new Ball(color, number);
    }
}
