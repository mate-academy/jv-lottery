package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery firstBall = new Lottery();
        firstBall.getRandomBall();

        Lottery secondBall = new Lottery();
        secondBall.getRandomBall();

        Lottery thirdBall = new Lottery();
        thirdBall.getRandomBall();
    }
}
