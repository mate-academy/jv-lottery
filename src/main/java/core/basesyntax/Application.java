package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Lottery lotteryBall1 = new Lottery();
        Lottery lotteryBall2 = new Lottery();
        Lottery lotteryBall3 = new Lottery();

        System.out.println(lotteryBall1.getRandomBall());
        System.out.println(lotteryBall2.getRandomBall());
        System.out.println(lotteryBall3.getRandomBall());
    }
}

