public class Main {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        Ball ball;
        for (int i = 1; i <= 3; i++) {
            ball = lottery.getRandomBall();
            System.out.println(ball);
        }
    }
}
