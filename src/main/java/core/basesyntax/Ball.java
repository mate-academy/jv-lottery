package core.basesyntax;

import java.util.Random;

public class Ball {
    private String color;
    private int number;

    public String getColor() {
        return new ColorSupplier().getRandomColor().toLowerCase();
    }

    public int getNumber() {
        return new Random().nextInt(100);
    }

    @Override
    public String toString() {
        return "Your Ball is: " + getColor()
                + '\''
                + ", with number=" + getNumber();
    }
}
