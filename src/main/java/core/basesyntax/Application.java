package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        int count = 3;
        while (count != 0) {
            System.out.println(new Lottery().getRandomBall());
            count--;
        }
    }
}
