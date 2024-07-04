package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int index = new Random().nextInt(BallsCollors.values().length);
        BallsCollors color = BallsCollors.values()[index];
        return color.toString();
    }
}
