package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Ball first = new Ball();
        Ball second = new Ball();
        Ball third = new Ball();

        first = Lottery.getRandomBall();
        second = Lottery.getRandomBall();
        third = Lottery.getRandomBall();

        System.out.println(first.toString());
        System.out.println(second.toString());
        System.out.println(third.toString());
    }
}
