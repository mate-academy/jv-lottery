package core.basesyntax;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ColorSupplier {
    private final List<Colors> randomColor = Collections.unmodifiableList(
            Arrays.asList(Colors.values()));
    private final int size = randomColor.size();
    private final Random random = new Random();

    public String getRandomColor() {
        return randomColor.get(random.nextInt(size)).name();
    }
}

