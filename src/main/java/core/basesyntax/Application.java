package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            Lottery balls = new Lottery();
            System.out.println(balls.getRandomBall());
        }
    }
}
