package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {
    public String getRundomBall() {
        int ballNum = new Random().nextInt(100);
        StringBuilder ballBilder = new StringBuilder();
        ballBilder.append(getRandomColor())
                .append(" ")
                .append(ballNum);
        return ballBilder.toString();
    }
}
