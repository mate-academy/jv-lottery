package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lot = new Lottery();
        Ball ball1 = lot.getRandomBall();
        Ball ball2 = lot.getRandomBall();
        Ball ball3 = lot.getRandomBall();
        System.out.println(ball1);
        System.out.println(ball2);
        System.out.println(ball3);
        // create three balls using class Lottery and print information about them in console
    }
}
