public class Test {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        int numberOfBalls = 5;

        for (int i = 0; i < numberOfBalls; i++) {
            Ball ball = lottery.getRandomBall();
            System.out.println("Ball " + (i + 1) + ": " + ball);
        }
    }
}
