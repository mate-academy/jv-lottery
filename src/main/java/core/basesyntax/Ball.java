package core.basesyntax;

import java.awt.*;
import java.util.Random;

public class Ball extends ColorSupplier {
    ColorSupplier color = new ColorSupplier();
    Random random = new Random();
    int number = random.nextInt(100);
}

