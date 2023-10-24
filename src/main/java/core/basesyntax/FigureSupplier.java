package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 101;

    public int getRandomNumber() {
        return new Random().nextInt(FIGURE_COUNT);
    }
}
