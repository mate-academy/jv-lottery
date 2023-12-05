package mate.academy;

import core.basesyntax.Lottery;

public class Main {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Lottery[] balls = new Lottery[3];
        for (int i = 0; i < 3; i++) {
            balls[i] = new Lottery();
            System.out.println(balls[i].getRandomBall());
        }
    }
}
