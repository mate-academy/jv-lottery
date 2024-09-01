package core.basesyntax;

import java.util.Random;

public class RandomValue extends EnumColors {
    public static Color getRandomColor() {
        Random random = new Random();
        int index = random.nextInt(Color.values().length);
        return EnumColors.Color.values()[index];
    }

    public static int getRandomNumber() {
        Random random = new Random();
        int bound = 100;
        return random.nextInt(bound);
    }
}
