package core.basesyntax;

import java.util.Random;

public class Lottery {
    public String getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        ColorList color = colorSupplier.getRandomColorList();
        Random random = new Random();
        int value = random.nextInt(100);
        return "Ball{" + "colorRandomOfEnum='" + color + '\'' + ", numberRandom=" + value + '}';
    }
}
