package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery[] ball = {new Ball(),new Ball(), new Ball()};
        for (Lottery balls : ball) {
            System.out.println(balls.getRandomBall());
        }
    }
}
