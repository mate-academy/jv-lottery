package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Loterry lotterry = new Loterry();
        for (int i = 0; i < 3; i++) {
            System.out.println(lotterry.getRandomBall());
        }
    }
}
