package core.basesyntax;

import java.util.Random;

public class Application {
    public static void main(String[] args) {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier(random);
        Lottery lotery = new Lottery(random, colorSupplier);
        Ball[] balls = new Ball[3];
        for (int i = 0; i < 3; i++) {
            balls[i] = lotery.getRandomBall();
        }
        System.out.println("Lets guess three BALLS, are you ready? \nGo.....");
        for (int i = 0; i < 3; i++) {
            System.out.println(balls[i].toString());
        }
        System.out.println("\nDid you win you billion?");
    }
}
