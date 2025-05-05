package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Ball[] ball = new Ball[3];
        for (int i = 0; i < ball.length; i++) {
            ball[i] = new Ball();
            System.out.println(ball[i].getRandomBall());
        }
    }
}
