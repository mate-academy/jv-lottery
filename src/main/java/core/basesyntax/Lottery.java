package core.basesyntax;

import java.util.Random;

public class Lottery {



    public Ball getRandomBall() {

        ColorSupplier colorSupplier = new ColorSupplier();
        int randomNumber = new Random().nextInt(100);
        ColorSupplier fff = new ColorSupplier();

        Ball bigball = new Ball();

        bigball.setColor(fff.toString());
        bigball.setNumber(randomNumber);

        return bigball;

    }

    public static void main(String[] args) {
        Lottery lottery = new Lottery();

        Ball ball1 = lottery.getRandomBall();
        Ball ball2 = lottery.getRandomBall();
        Ball ball3 = lottery.getRandomBall();
    }
}