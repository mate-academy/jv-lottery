package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();

        Ball b1 = lottery.getRandomBall();
        Ball b2 = lottery.getRandomBall();
        Ball b3 = lottery.getRandomBall();

        System.out.println(b1.toString() + " " + b2.toString() + " " + b3);
    }
}
