package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery[] balls = new Lottery[3];
        for (int i = 0; i < 3; i++) {
            balls[i] = new Lottery();
            System.out.println(balls[i].getRandomBall());
        }
    }
}
