package core.basesyntax;

import java.util.Random;

public class Loterry extends ColorSupplier {
    @Override
    public Color getRandomColor() {

        return super.getRandomColor();
    }

    public int getRandomBall() {
        Random random = new Random();
        int ball = random.nextInt(10);
        return ball;
   }
}
