package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery one = new Lottery();

        for (int i = 0; i < 3; i++) {
            System.out.println(one.getRandomBall());
        }
    }
}
