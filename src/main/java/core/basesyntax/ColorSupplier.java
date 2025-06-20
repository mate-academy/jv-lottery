package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    int indColor = new Random().nextInt(Ball.Colors.values().length);
    final String getRandomColor() {
        return Ball.Colors.values()[indColor].name();
    }
}
