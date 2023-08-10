package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        Ball firstBall = new Ball();
        Ball secondBall = new Ball();
        Ball thirdBall = new Ball();

        System.out.println(lottery.getRandomBall(firstBall));
        System.out.println(lottery.getRandomBall(secondBall));
        System.out.println(lottery.getRandomBall(thirdBall));

    }
}
