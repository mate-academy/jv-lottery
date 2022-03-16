package core.basesyntax;

import java.util.Random;

public class Lottery extends Ball {
    public Lottery() {
    }

    public Lottery(int value, String color) {
        super(value, color);
    }

    public Lottery getRandomBall() {
        ColorSupplier rndColor = new ColorSupplier();
        String randomColor = rndColor.getRandomColor().toString();

        Random rndValue = new Random();
        int randomValue = rndValue.nextInt(100);

        return new Lottery(randomValue, randomColor);
    }
}
