package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Ball ball1 = new Lottery().getRandomBall();
        Ball ball2 = new Lottery().getRandomBall();
        Ball ball3 = new Lottery().getRandomBall();
        System.out.println("Ball: " + ball1.getNumber() + " " + ball1.getColor());
        System.out.println("Ball: " + ball2.getNumber() + " " + ball2.getColor());
        System.out.println("Ball: " + ball3.getNumber() + " " + ball3.getColor());
        // create three balls using class Lottery and print information about them in console
    }
}
