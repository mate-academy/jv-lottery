public class Test {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        int numberOfBalls = 5;

        for (int i = 0; i < numberOfBalls; i++) {
            System.out.println("Ball " + (i + 1) + ": " + lottery.getRandomBall());
        }
    }
}
