package core.basesyntax;

import java.util.Random;

public class Ball {
    @Override
    public String toString() {
        String color = (new ColorSupplier()).getRandomColor();
        int number = new Random().nextInt(100);
        return color + " " + number;
    }
}
