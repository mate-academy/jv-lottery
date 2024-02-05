package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static Ball getRandomBall() {
        Colors randomColor = ColorSupplier.getRandomColor();
        int randomNumber = new Random().nextInt(101);
        return new Ball(randomColor,randomNumber);
        // create three balls using class Lottery and print information about them in console
    }

    public static void main(String[] args) {
        Ball randomBall1 = Lottery.getRandomBall();
        Ball randomBall2 = Lottery.getRandomBall();
        Ball randomBall3 = Lottery.getRandomBall();
        System.out.println("Random Ball: " + randomBall1);
        System.out.println("Random Ball1: " + randomBall2);
        System.out.println("Random Ball2: " + randomBall3);
    }

}

