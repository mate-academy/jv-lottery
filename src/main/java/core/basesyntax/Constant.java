package core.basesyntax;

import java.util.Random;

public class Constant {
    private final int ballNumber = new Random().nextInt(100);

    public int getBallNumber() {
        return ballNumber;
    }

}
