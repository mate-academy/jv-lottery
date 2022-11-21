package core.basesyntax;

import static core.basesyntax.Lottery.getRandomBall;

public class Main {

    public static void main(String[] args) {

        Ball ball1 = getRandomBall();
        Ball ball2 = getRandomBall();
        Ball ball3 = getRandomBall();
        Ball[] ballsArray = {ball1, ball2, ball3};

        for (Ball element: ballsArray) {
            System.out.println(element.toString());
        }
    }
}
