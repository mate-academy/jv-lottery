package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery[] balls1 = {new Lottery(), new Lottery(), new Lottery()};
        for (Lottery pr : balls1) {
            System.out.println(pr.getRandomBall());
        }
    }
}
