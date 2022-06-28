package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {
    public String getRandomBall() {
        Random random = new Random();
        int value = random.nextInt(100);
        return "Color: " + getRandomColor() + " and number: " + value;
    }
}
