package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public BallColors getRandomColor() {
        BallColors[] ballColors = BallColors.values();
        Random rndCol = new Random();
        return ballColors[rndCol.nextInt(ballColors.length - 1)];
    }
}
