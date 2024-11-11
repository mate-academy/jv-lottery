package core.basesyntax;

import java.util.Arrays;

public class ColorSupplier {
    public String getRandomColor() {
        return Arrays.stream(Color.values()).findAny().get().name();
    }
}
