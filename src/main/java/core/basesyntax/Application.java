package core.basesyntax;

import static core.basesyntax.Lottery.getRandomBall;

public class Application {
    public static void main(String[] args) {
        Ball[] ballsArray = new Ball[3];
        for (int i = 0; i < ballsArray.length; i++) {
            ballsArray[i] = getRandomBall();
        }
        for (Ball element: ballsArray) {
            System.out.println(element.toString());
        }
    }
}
