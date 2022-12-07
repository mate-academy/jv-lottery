package core.basesyntax;

public class Application {
    public static void main(String[] args) {

        int i = 0;
        while (i < 3) {
            System.out.println(new Lottery().getRandomBall());
            i++;
        }
    }
}
