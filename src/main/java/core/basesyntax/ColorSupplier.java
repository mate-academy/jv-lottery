package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Color[] colors = Color.values();
    private Random random = new Random();
    private String randomColor;

    private void setRandomColor() {
        int index = random.nextInt(colors.length);
        this.randomColor = colors[index].toString();
    }

    public String getRandomColor() {
        setRandomColor();
        return randomColor;
    }
}
