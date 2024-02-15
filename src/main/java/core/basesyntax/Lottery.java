package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static final int MAX_NUMBER = 101;
    Random value = new Random();
    public int getRandomNumber() {
        return value.nextInt(MAX_NUMBER);
    }

    public String getRandomBall() {
        return new ColorSupplier().getRandomColor() + " " + getRandomNumber();
    }
}
