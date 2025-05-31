package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public Ball.Colors getRandomColor() {
        Ball.Colors[] allColors = Ball.Colors.values();
        Ball.Colors randomColor = allColors[new Random().nextInt(allColors.length)];
        return randomColor;
    }
}
