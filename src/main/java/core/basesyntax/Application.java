package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();

        Ball randomBall1 = lottery.getRandomBall();
        Ball randomBall2 = lottery.getRandomBall();
        Ball randomBall3 = lottery.getRandomBall();

        System.out.println(randomBall1);
        System.out.println(randomBall2);
        System.out.println(randomBall3);
    }
}
