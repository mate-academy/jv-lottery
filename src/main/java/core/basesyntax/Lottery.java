package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {
    public String getRandomBall() {
        int number = new Random().nextInt(100);
        return "Ball hass number: " + number + " and color: " + getRandomColor();
    }
}
