package core.basesyntax;

public class Application {
    public static void main(String[] args) {

        Ball ball1 = new Ball().getRandomBall();
        Ball ball2 = new Ball().getRandomBall();
        Ball ball3 = new Ball().getRandomBall();

        System.out.println(ball1.toString());
        System.out.println(ball2.toString());
        System.out.println(ball3.toString());
        // create three balls using class Lottery and print information about them in console
    }
}
