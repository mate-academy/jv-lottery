package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();

        Ball randomBall = lottery.getRandomBall();
        Ball randomBall1 = lottery.getRandomBall();
        Ball randomBall2 = lottery.getRandomBall();
        System.out.println(randomBall);
        System.out.println(randomBall1);
        System.out.println(randomBall2);
    }
}
