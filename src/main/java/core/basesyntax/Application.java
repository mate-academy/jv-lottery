package core.basesyntax;

public class Application extends Lottery {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Ball ball1 = new Ball();
        Ball ball2 = new Ball();
        Ball ball3 = new Ball();
        System.out.println(ball1.getRandomBall());
        System.out.println(ball2.getRandomBall());
        System.out.println(ball3.getRandomBall());
    }
}
