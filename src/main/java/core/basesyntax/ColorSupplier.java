package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Random random = new Random();
        int randomIndex = random.nextInt(Ball.ColorEnum.values().length);
        return Ball.ColorEnum.values()[randomIndex].toString();
    }
}
