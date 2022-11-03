package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random randomNumber = new Random();

    private final ColorSupplier randomColor = new ColorSupplier();

    public Ball getrandomball() {
        Ball randomball = new Ball(randomColor.getRandomColor(),randomNumber.nextInt(100));
        return randomball;
    }
}
