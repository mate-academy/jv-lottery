package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Lottery letDoLottery = new Lottery();
        Ball [] randomBalls = new Ball[3];
        for (int i = 0; i < randomBalls.length; i++) {
            randomBalls[i] = letDoLottery.getRandomBall();
            System.out.println(randomBalls[i]);
        }

    }
}
