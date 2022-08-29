package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        var lottery = new Lottery();
        int numOfBalls = 3;

        while (numOfBalls > 0) {
            Ball ball = lottery.getRandomBall();
            System.out.println(ball);
            numOfBalls--;
        }
    }
}