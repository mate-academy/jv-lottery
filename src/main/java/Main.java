public class Main {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        Ball[] balls = new Ball[3];
        for (int i = 0; i < 3; i++) {
            balls[i] = lottery.getRandomBall();
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(balls[i]);
        }
    }
}
