package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery bal = new Lottery();

        Ball ball1 = bal.getRandomBall();
        Ball ball2 = bal.getRandomBall();
        Ball ball3 = bal.getRandomBall();

        System.out.println(ball1);
        System.out.println(ball2);
        System.out.println(ball3);

        // create three balls using class Lottery and print information about them in console
    }
}
