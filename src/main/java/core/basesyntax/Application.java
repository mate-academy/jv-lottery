package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        Ball[] ball = new Ball[3];
        for (int i = 0; i < 3; i++) {
            ball[i] = lottery.getRandomBall();
        }
        for (Ball balls : ball) {
            System.out.println(balls);
        }
    }
}
