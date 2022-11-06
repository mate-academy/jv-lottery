package core.basesyntax;

import java.util.Random;

public class Lottery {
    final int numberBall = 100;
    Random random;
    ColorSupplier colorSupplier;

    public int getNumberBall() {
        return numberBall;
    }
    /* public void setNumberBall(int numberBall) {
         this.numberBall = numberBall;
     }*/
    public Ball getRandomBall() {

        colorSupplier = new ColorSupplier();
        random = new Random();
        Ball ball = new Ball(random.nextInt(numberBall), colorSupplier.getRandomColor());
        return ball;
    }
}
