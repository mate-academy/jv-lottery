package core.basesyntax;

public class Application {
    private static final int INITIAL_ITERRATOR = 0;
    private static final int MAX_QUANTITY_OF_CREATED_OBJECTS = 3;

    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        for (int i = INITIAL_ITERRATOR; i < MAX_QUANTITY_OF_CREATED_OBJECTS; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
