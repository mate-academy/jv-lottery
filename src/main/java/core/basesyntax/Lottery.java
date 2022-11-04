package core.basesyntax;

import java.util.Random;

public class Lottery {
    private int numberBall = 100;

    public int getNumberBall() {
        return numberBall;
    }

    public void setNumberBall(int numberBall) {
        this.numberBall = numberBall;
    }

    public Ball getRandomBall() {

        ColorSupplier colorSupplier = new ColorSupplier();
        Random random = new Random();
        Ball ball = new Ball(random.nextInt(numberBall), colorSupplier.getRandomColor());
        return ball;
    }
}
