package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int index = new Random().nextInt(BallCollors.values().length);
        BallCollors color = BallCollors.values()[index];
        return color.toString();
    }
}
