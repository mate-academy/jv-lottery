package core.basesyntax;

import java.util.Random;

public class Lottery {
    public String getRandomBall() {
        Random random = new Random();
        int col = random.nextInt(Colors.values().length);
        int num = random.nextInt(100);
        return Colors.values()[col] + " " + num;
    }
}
