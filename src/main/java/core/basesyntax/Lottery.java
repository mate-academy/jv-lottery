package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {

        int randomNumber = new Random().nextInt(100);
        ColorSupplier fff = new ColorSupplier();
        Ball bigball = new Ball();
        bigball.setColor(fff.toString());
        bigball.setNumber(randomNumber);
        return bigball;
    }
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        for (int i = 1; i <= 3; i++) {
            Ball randomBall = lottery.getRandomBall();
            System.out.println("Random Ball " + i + ": " + randomBall);
        }
    }
}