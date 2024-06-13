package core.basesyntax;

import java.util.Random;

public class ColorSupplier extends Ball {
    public String getRandomColor() {
        int random = new Random().nextInt(BallCollor.values().length);
        return BallCollor.values()[random].toString().toLowerCase();
    }
}
