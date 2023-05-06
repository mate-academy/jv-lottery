package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Ball first = Lottery.getRandomBall();
        Ball second = Lottery.getRandomBall();
        Ball third = Lottery.getRandomBall();

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
    }
}
