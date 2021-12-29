package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {
    public String getRandomBall() {
        setColor(getRandomColor());
        setNumber(new Random().nextInt(100));
        return "color is: " + getColor() + ", number is: " + getNumber();
    }
}
