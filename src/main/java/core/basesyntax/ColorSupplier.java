package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public String getRandomColor() {
        int randomIndex = random.nextInt(Ball.Color.values().length);
        return Ball.Color.values()[randomIndex].name();
    }
}
