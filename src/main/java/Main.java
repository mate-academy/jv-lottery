
public class Main {
    private static final int NUM_BALLS = 3;

    public static void main (String[] args){
        Lottery lottery = new Lottery();
        for (int i = 0; i < NUM_BALLS; i++) {
            Ball ball = lottery.getRandomBall();
            System.out.println(ball);
        }
    }
}
