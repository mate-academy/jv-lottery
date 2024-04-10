package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console

        Ball ball1 = Lottery.getRandomBall();
        Ball ball2 = Lottery.getRandomBall();
        Ball ball3 = Lottery.getRandomBall();

        System.out.println("First ball" + ball1);
        System.out.println("Second ball" + ball2);
        System.out.println("Third ball" + ball3);
    }
}
