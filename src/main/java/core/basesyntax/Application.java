package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // Create an instance of Lottery
        Lottery lottery = new Lottery();

        // Create an array to hold the balls
        Ball[] balls = new Ball[3];

        // Generate three random balls
        for (int i = 0; i < balls.length; i++) {
            balls[i] = lottery.getRandomBall();
        }

        // Print information about the balls in the console
        for (int i = 0; i < balls.length; i++) {
            System.out.println("Ball " + (i + 1) + ": " + balls[i]);
        }
    }
}

