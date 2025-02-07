package core.basesyntax;

import java.util.Random;

public class Lottery {

    String[] randomBall = new String[];

    public String[] getRandomBall() {

        Integer ball_number = 0;


        Random random = new Random();
        int lowerBound = 0;
        int upperBound = 101;
        int random_number = random.nextInt(upperBound - lowerBound) + lowerBound;
        ball_number = random_number;


        randomBall = randomColor + ", " + ball_number;
    }
}


