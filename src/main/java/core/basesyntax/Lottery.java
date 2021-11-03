package core.basesyntax;

import java.util.Random;

public class Lottery {

    public  int getRandomBall() {
        String randomBall;
        int randNumber;
        Random rand = new Random();
        return randNumber = rand.nextInt(100);
    }


}
