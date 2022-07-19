package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static final int MAX_NUMBER = 100;
    private int numberOfBall;
    private String colorOfBall;

    public Ball getRandomBall() {
        return new Ball(getColorOfBall(), getNumberOfBall());
    }

    public int getNumberOfBall() {
        return numberOfBall;
    }

    public String getColorOfBall() {
        return colorOfBall;
    }

    public void setNumberOfBall(int numberOfBall) {
        Random random = new Random();
        this.numberOfBall = random.nextInt(MAX_NUMBER);
    }

    public void setColorOfBall(String colorOfBall) {
        ColorSupplier colorSupplier = new ColorSupplier();
        this.colorOfBall = colorSupplier.getRandomColor();
    }
}
