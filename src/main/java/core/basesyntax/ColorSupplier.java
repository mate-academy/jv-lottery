package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private String colorRandomBall;

    public String getColorRandomBall() {
        return colorRandomBall;
    }

    public void setColorRandomBall(String colorRandomBall) {
        this.colorRandomBall = colorRandomBall;
    }

    public String getRandomColor() {

        Color[] colors = Color.values();
        Random random = new Random();
        colorRandomBall = colors[random.nextInt(colors.length)].name();
        return colorRandomBall;

    }
}
