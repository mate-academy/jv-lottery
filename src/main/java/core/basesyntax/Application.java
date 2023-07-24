package core.basesyntax;

public class Application extends Lottery {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Ball №" + i + ":" + "\n" + getRandomBall());
        }
    }
}
