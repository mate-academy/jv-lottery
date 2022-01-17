package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            Lottery bal = new Lottery();
            System.out.println(bal.getRandomBall());
        }
    }
}
