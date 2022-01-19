package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery letDoLottery = new Lottery();
        Ball[] randomBalls = new Ball[3];
        for (int i = 0; i < randomBalls.length; i++) {
            randomBalls[i] = letDoLottery.getRandomBall();
            System.out.println(randomBalls[i]);
        }

    }
}
