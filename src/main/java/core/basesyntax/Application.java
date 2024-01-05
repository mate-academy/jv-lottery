package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery game = new Lottery();
        for (int i = 0; i < 3; i++) {
            System.out.println(game.getRandomBall());
        }
    }
}
