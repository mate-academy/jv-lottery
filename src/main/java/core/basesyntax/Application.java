package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery1 = new Lottery();
        for (int i = 0; i < 3; i++) {
            System.out.println(lottery1.getRandomBall());
        }
    }
}
