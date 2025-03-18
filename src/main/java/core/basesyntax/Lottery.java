package core.basesyntax;

import java.util.Random;

public class Lottery {
    private int randomNumber = new Random().nextInt(100);
    private String randomColor = new ColorSupplier().getRandomColor();
    private Ball randomBall = new Ball(randomNumber, randomColor);

    public Ball getRandomBall() {
        return this.randomBall;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            Lottery newLot = new Lottery();
            System.out.println(newLot.getRandomBall());
        }
    }
}
