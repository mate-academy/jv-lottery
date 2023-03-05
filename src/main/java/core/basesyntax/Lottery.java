package core.basesyntax;

import java.util.Random;

public class Lottery {
    private ColorSupplier color = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(color.getRandomColor().toString(), getRandomNumber());
    }

    public int getRandomNumber() {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        return randomNumber;
    }
}
