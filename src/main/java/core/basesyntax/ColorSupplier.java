package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor(Ball ball) {
        Random random = new Random();
        int index = random.nextInt(Colors.values().length);
        ball.setColor(Colors.values()[index]);
        return ball.getColor();
    }
}
