package core.basesyntax;

import java.util.Random;

public class ColorSupplier extends Lottery {
    public String getRandomColor() {

        int randomIndex = new Random().nextInt(Colors.values().length);

        Ball ball = new Ball();

        ball.setColor(String.valueOf(Colors.values()[randomIndex]));

        return ball.getColor();
    }
}
