package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {
    public int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(100);
    }

    public String getRandomBall() {
        return "Number: " + getRandomNumber() + "   Color: " + getRandomColor();
    }

    @Override
    public String toString() {
        return "Number: " + getRandomNumber() + "   Color: " + getRandomColor();
    }
}
