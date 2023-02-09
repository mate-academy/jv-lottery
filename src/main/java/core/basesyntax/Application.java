package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery[] lottery = new Lottery[3];
        for (int i = 0; i < 3; i++) {
            lottery[i] = new Lottery();
            System.out.println(lottery[i].getRandomBall());
        }
    }
}
