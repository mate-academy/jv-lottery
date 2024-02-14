package core.basesyntax;

import java.util.Random;

public class Ball {
    static final int MAX_NUMBER = 101;
    private Color color;
    private int number;

    public int getRandomNumber() {
        Random value = new Random();
        number = value.nextInt(MAX_NUMBER);
        return number;
    }

    @Override
    public String toString() {
        return "Ball{"
                +
                "number="
                + number
                +
                '}';
    }
}
