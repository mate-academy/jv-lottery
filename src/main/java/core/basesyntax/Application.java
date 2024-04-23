package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // Create an instance of Lottery
        Lottery lottery = new Lottery();

        // Create three balls using the getRandomBall() method
        Ball ball1 = lottery.getRandomBall();
        Ball ball2 = lottery.getRandomBall();
        Ball ball3 = lottery.getRandomBall();

        // Print information about the balls in the console
        System.out.println("Ball 1: " + ball1);
        System.out.println("Ball 2: " + ball2);
        System.out.println("Ball 3: " + ball3);
    }
}
