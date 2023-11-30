package core.basesyntax;

import java.util.Random;

public class Lottery extends Ball {
    public String getRandomBall() {
        int number = new Random().nextInt(100);
        String color = ColorSupplier.getRandomColor();
        super.setColor(color);
        super.setNumber(number);
        return color + " " + number;
    }
}
