package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static String getRandomBall() {
        int index = new Random().nextInt(Color.values().length);
        return Color.values()[index].toString();
    }
}

