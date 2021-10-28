package core.basesyntax;

import static core.basesyntax.Lottery.getRandomBall;

public class Application {
    public static void main(String[] args) {
        Ball ball = getRandomBall();
        Ball ball1 = getRandomBall();
        Ball ball2 = getRandomBall();
        Ball[] bollArray = new Ball[] {ball, ball1, ball2};
        for (Ball bollForEach : bollArray) {
            System.out.println(bollForEach);
        }
    }
}
