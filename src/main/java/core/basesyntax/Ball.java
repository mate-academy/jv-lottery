package core.basesyntax;

import java.util.Random;

public class Ball extends ColorSupplier{
    public Colors color = getRandomColor();
    public int number = new Random().nextInt(100);

    @Override
    public String toString() {
        return "Ball{" +
                "color=" + color +
                ", number=" + number +
                '}';
    }
}
