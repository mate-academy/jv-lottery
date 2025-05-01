package core.basesyntax;

import java.util.Random;

public class Ball extends ColorSupplier {
    protected String color = getRandomColor();
    protected int number = new Random().nextInt(100);

    @Override
    public String toString() {
        return (color + number).toString();
    }
}
