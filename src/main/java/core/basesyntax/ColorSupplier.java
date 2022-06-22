package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private String randomBall;

    public void setRandomBall() {
        int index = new Random().nextInt(Color.values().length);
        this.randomBall = String.valueOf(Color.values()[index]);
    }

    public String getRandomColor() {
        setRandomBall();
        return randomBall;
    }
}
