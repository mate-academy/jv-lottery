package core.basesyntax;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Lottery lottery = new Lottery();
        for (int i = 0; i < 3; i++) {
            Ball randomBall = lottery.getRandomBall();
            System.out.println(randomBall.getColour() + " " + randomBall.getNumber());
        }
    }
}
