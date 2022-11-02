package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private String randomColor;
    public void setRandomColor(String randomColor) {
        this.randomColor = randomColor;
    }
    public String getRandomColor() {
        Color[] colors = Color.values();
        Random random = new Random();
        return randomColor = colors[random.nextInt(colors.length)].toString();
    }
}
