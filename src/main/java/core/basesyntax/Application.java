package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        // create three balls using class Lottery and print information about them in console
        int ballsCount = 3;
        for (int i = 0; i < ballsCount;i++) {
            Ball randomBall = lottery.getRandomBall();
            System.out.println(randomBall.toString());
        }
    }
}
