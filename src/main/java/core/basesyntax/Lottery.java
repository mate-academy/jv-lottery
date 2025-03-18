package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final int maxBalls = 100;

    public Ball getRandomBall() {
        int randomNumber = new Random().nextInt(maxBalls);
        String randomColor = new ColorSupplier().getRandomColor();
        Ball randomBall = new Ball(randomNumber, randomColor);
        return randomBall;
    }

    public static void main(String[] args) {
        Lottery newLot = new Lottery();
        for (int i = 0; i < 3; i++) {
            System.out.println(newLot.getRandomBall());
        }
    }
}
