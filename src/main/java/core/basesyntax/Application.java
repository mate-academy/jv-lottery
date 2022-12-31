package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Ball[] luckyBalls =
                {Lottery.getRandomBall(), Lottery.getRandomBall(), Lottery.getRandomBall()};
        for (Ball lucky : luckyBalls) {
            System.out.println(lucky.toString());
        }
    }
}
