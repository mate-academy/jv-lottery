package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {
    public String getRandomBall() {
        Random random = new Random();
        int qwe = random.nextInt(100);
        return String.valueOf(qwe);
    }
}
