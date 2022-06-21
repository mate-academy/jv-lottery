package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private String randomBall;

    public void setRandomBall() {
        int index = new Random().nextInt(Colors.values().length);
        this.randomBall = String.valueOf(Colors.values()[index]);
    }

    public String getRandomColor() {
        setRandomBall();
        return randomBall;
    }
}
