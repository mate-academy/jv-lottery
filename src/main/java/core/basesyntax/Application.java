package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Lottery firstBall = new Ball();
        Lottery secondBall = new Ball();
        Lottery thirdBall = new Ball();

        Lottery[] lotteries = new Lottery[]{firstBall, secondBall, thirdBall};
        for (Lottery lottery : lotteries) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
