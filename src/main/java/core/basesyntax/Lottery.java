package core.basesyntax;

import java.util.Random;

public class Lottery extends Ball {
    public Ball getRandomBall() {
        String rndColorStr = getRandomColor();
        Random rndN = new Random();
        int rndNum = rndN.nextInt(100);
        Ball rndBall = new Ball();
        rndBall.setNumber(rndNum);
        rndBall.setColor(rndColorStr);
        return rndBall;
    }
}
