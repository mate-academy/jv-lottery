package core.basesyntax;

import core.basesyntax.constants.Color;
import java.util.Random;
import lombok.Getter;

@Getter
public class ColorSupplier {
    private final Random random = new Random();

    public String getRandomColor() {
        return Color.values()[random.nextInt(Color.values().length)].toString();
    }
}
