package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println(new Lottery().getRandomBall().toString());
            i++;
        } while (i != 3);
    }
}
