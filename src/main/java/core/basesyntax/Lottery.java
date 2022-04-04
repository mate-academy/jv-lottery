package core.basesyntax;

import java.util.Random;

public class Lottery {
    static final int BOUND = 100;
    ColorSupplier randomColor = new ColorSupplier();
    Random randomNumber = new Random();

    public Ball getRandomBall() {
        String color = randomColor.getRandomColor();
        int number = randomNumber.nextInt(BOUND);
        return new Ball(color, number);
    }
}
