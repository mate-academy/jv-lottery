package core.basesyntax;

import java.util.Random;

public class RandoM extends Enum {
    public Color getRandomColor() {
        Random random = new Random();
        int index = random.nextInt(Color.values().length);
        return Color.values()[index];
    }

    public int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(100);
    }
}
