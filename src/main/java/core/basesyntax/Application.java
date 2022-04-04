package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Ball[] balls = new Ball[3];
        Lottery lottery = new Lottery();

        Ball first = lottery.getRandomBall();
        Ball second = lottery.getRandomBall();
        Ball third = lottery.getRandomBall();

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
    }
}
