package core.basesyntax;

import java.util.Random;

public class Ball {
    private ColorSupplier color;
    private int number;

    public int getRandomNumber() {
        Random value = new Random();
        number = value.nextInt(101);
        return number;
    }

    @Override
    public String toString() {
        return "Ball{"
                +
                "color='"
                + color
                + '\''
                +
                ", number="
                + number
                +
                '}';
    }
}



