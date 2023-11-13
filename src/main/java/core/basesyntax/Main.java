package core.basesyntax;

import java.sql.SQLOutput;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Lottery balls = new Lottery();
        Random getRandomBall = new Random();


        for (int i = 0; i < 3; i++) {
            int randomBall = getRandomBall.nextInt(101);

            System.out.println (randomBall);

        }
    }
}

