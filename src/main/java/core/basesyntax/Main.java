package core.basesyntax;

import java.sql.SQLOutput;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random getRandomBall = new Random();

        for (int i = 0; i < 3; i++) {
            int randomInt = getRandomBall.nextInt(101);

            System.out.println (randomInt);

        }
    }
}

