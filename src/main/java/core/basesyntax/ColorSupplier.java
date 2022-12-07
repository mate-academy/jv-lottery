package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public String getRandomColor() {
        ColorsEnum [] colors = ColorsEnum.values();
        ColorsEnum randomColor = colors[random.nextInt(colors.length)];
        return randomColor.toString();
    }
}
