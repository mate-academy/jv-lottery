package core.basesyntax;

import java.util.Random;

public class Lottery {

    private ColorSupplier colorRandomizer = new ColorSupplier();
    private Random generateRandomNumber = new Random();

    public Ball getRandomBall() {
        int randomNumber = generateRandomNumber.nextInt(0, 100);
        return new Ball(colorRandomizer.getRandomColor(), randomNumber);
    }
}
