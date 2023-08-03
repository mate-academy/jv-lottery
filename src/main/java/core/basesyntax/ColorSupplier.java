package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public Color[] getColors() {
        return colors;
    }

    public void setColors(Color[] colors) {
        this.colors = colors;
    }

    public int getRandomIndex() {
        return randomIndex;
    }

    public void setRandomIndex(int randomIndex) {
        this.randomIndex = randomIndex;
    }

    private Color[] colors = Color.values();
    private int randomIndex = new Random().nextInt(colors.length);

    public String getRandomColor() {
        return colors[randomIndex].toString();
    }
}
