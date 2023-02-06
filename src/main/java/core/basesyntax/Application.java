package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Ball b1 = Lottery.getRandomBall();
        System.out.println(b1.toString());
        Ball b2 = Lottery.getRandomBall();
        System.out.println(b2.toString());
        Ball b3 = Lottery.getRandomBall();
        System.out.println(b3.toString());
    }
}
