package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        String firstBall = lottery.getRandomBall();
        String secondBall = lottery.getRandomBall();
        String thirdBall = lottery.getRandomBall();

        System.out.println(firstBall + "\n" + secondBall + "\n" + thirdBall);
        // create three balls using class Lottery and print information about them in console
    }
}
