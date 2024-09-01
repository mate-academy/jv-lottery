package core.basesyntax;

public class Application extends Lottery {
    public static void main(String[] args) {
        Application app = new Application();
        for (int i = 1; i < 4; i++) {
            System.out.println("Ball" + i + ": " + app.getRandomBall());
        }
    }
}
