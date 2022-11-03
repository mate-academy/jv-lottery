package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    String colorRandomBall;
    public String getRandomColor() {
        Color[] colors = Color.values();
        Random random = new Random();
        colorRandomBall  = colors[random.nextInt(colors.length)].name();
        return colorRandomBall;
    }
}
