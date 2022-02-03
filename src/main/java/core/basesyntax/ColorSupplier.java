package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    private Random color = new Random();
    private int index = new Random().nextInt(Color.values().length);

    public String getRandomColor() {
        String colorBall = String.valueOf(Color.values()[index]);
        return colorBall;
    }

    public void setColor(Random color) {
        this.color = color;
    }
}
