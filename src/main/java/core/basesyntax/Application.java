package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        Ball[] ball = new Ball[3];

        for (int i = 0; i < ball.length; i++) {
            ball[i] = lottery.getRandomBall();
            System.out.println(ball[i].toString());
        }
    }
}

