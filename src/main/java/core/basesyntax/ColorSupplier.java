package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random randomColor = new Random();

    public void setRandomColor(Random randomColor) {
        this.randomColor = randomColor;
    }

    public String getRandomColor() {
        int colorBall = randomColor.nextInt(Color.values().length);
        return Color.values()[colorBall].name();
    }
}
