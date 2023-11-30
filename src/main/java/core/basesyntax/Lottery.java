package core.basesyntax;

import java.util.Random;

public class Lottery extends Ball {
    public String getRandomBall() {
        int number = new Random().nextInt(100);
        String color = ColorSupplier.getRandomColor();
        super.color = color;
        super.number = number;
        return color + " " + number;
    }
}
