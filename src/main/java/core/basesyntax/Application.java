package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery[] lottery = new Lottery[]{new Lottery(), new Lottery(), new Lottery()};
        for (Lottery ball : lottery) {
            System.out.println(ball.getRandomBall());
        }
    }
}
