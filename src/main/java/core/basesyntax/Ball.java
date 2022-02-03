package core.basesyntax;

import java.util.Random;

public class Ball extends ColorSupplier {
    private String color;
    private int number;

    public String getColor() {
        color = getRandomColor();
        return color;
    }

    public int getNumber() {
        number = new Random().nextInt(100);
        return number;
    }
}
