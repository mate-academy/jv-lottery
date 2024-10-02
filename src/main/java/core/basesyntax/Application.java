package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Lottery lottery = new Lottery();

        Ball ball1 = lottery.GetRandomBall();
        Ball ball2 = lottery.GetRandomBall();
        Ball ball3 = lottery.GetRandomBall();

        System.out.println(ball1);
        System.out.println(ball2);
        System.out.println(ball3);
    }
}
