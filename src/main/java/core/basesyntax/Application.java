package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        Ball firstBall = lottery.getRandomBall();
        Ball secondBall = lottery.getRandomBall();
        Ball thirdBall = lottery.getRandomBall();
        System.out.println("first ball -> " + firstBall);
        System.out.println("second ball -> " + secondBall);
        System.out.println("third ball -> " + thirdBall);
    }
}
