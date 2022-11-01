package core.basesyntax;

import java.util.Random;

public class Lottery {
    public int getRandomBall(){

        Random randomNumberBall = new Random();
        int randomBall = randomNumberBall.nextInt(100) + 1;


        return  randomBall;
    }
}
