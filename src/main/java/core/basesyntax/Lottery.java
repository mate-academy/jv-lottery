package core.basesyntax;

import java.util.Random;

public class Lottery {

    private static final ColorSupplier colorSupplier = new ColorSupplier();

    public static Ball getRandomBall() {
        String color = colorSupplier.getRandomColor();
        int randomNumber = new Random().nextInt(101);

        return new Ball(color, randomNumber);
    }

    public static void main(String[] args) {

        Ball ball1 = Lottery.getRandomBall();
        Ball ball2 = Lottery.getRandomBall();
        Ball ball3 = Lottery.getRandomBall();

        System.out.println("Ball 1:" + ball1);
        System.out.println("Ball 2:" + ball2);
        System.out.println("Ball 3:" + ball3);
    }
}
