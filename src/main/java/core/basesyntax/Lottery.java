package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {
    @Override
    public String getRandomColor() {
        return Colors.values()[new Random().nextInt(Colors.values().length)].toString();
    }

    public String getRandomBall() {
        return "Ball color: " + getRandomColor()
                + ", ball number: " + new Random().nextInt(100);
    }
}
