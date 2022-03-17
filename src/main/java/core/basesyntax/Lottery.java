package core.basesyntax;

import java.util.Random;

public class Lottery {
    public String getRandomBall() {
        ColorSupplier color = new ColorSupplier();
        color.getRandomColor();
        return "It`s a " + color.getRandomColor() + " ball number "
                + new Random().nextInt(100) + "!";
    }
}
