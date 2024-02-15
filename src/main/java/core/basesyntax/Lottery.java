package core.basesyntax;

import java.util.Random;

public class Lottery {
    public final int MAX_NUMBER = 101;
    public int getRandomNumber() {
        Random value = new Random();
        return value.nextInt(MAX_NUMBER);
    }

    public String getRandomBall() {
        return new ColorSupplier().getRandomColor() + " " + getRandomNumber();
    }
}
