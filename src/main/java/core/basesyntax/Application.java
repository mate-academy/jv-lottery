package core.basesyntax;

public class Application extends Lottery {
    public static void main(String[] args) {
        Application app = new Application();
        for (int i = 0; i < 3; i++) {
            System.out.println(app.getRandomBall());
        }

    }
}
