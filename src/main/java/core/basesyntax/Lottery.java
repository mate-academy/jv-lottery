package core.basesyntax;

import java.util.Random;

public class Lottery {

    public static final int NUMERIC = 100;

    public static String getRandomBall() {

        Colors color = new ColorSupplier().getRandomColor();
        int randomCislo = new Random().nextInt(NUMERIC);

        return color + " " + randomCislo;
    }
}
