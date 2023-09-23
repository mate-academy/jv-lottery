package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        // Create three random balls and print their information
        for (int i = 0; i < 3; i++) {
            Ball ball = Lottery.getRandomBall();
            System.out.println(ball);
        }
    }
}
