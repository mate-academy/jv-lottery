package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();

        Ball ballOne = lottery.getRandomBall();
        Ball ballTwo = lottery.getRandomBall();
        Ball ballThree = lottery.getRandomBall();

        System.out.println(ballOne);
        System.out.println(ballTwo);
        System.out.println(ballThree);

    }
}
