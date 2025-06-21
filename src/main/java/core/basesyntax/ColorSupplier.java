package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    final String getRandomColor() {
        int indColor = new Random().nextInt(Ball.Colors.values().length);
        return Ball.Colors.values()[indColor].name();
    }
}
