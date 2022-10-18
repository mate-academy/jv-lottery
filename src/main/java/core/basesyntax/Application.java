package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        final int INITIAL_ITERRATOR_FOR_CREATED_OBJECTS = 0;
        final int MAX_VALUE_FOR_CREATED_OBJECTS = 3;
        Lottery lottery = new Lottery();
        for (int i = INITIAL_ITERRATOR_FOR_CREATED_OBJECTS; i < MAX_VALUE_FOR_CREATED_OBJECTS; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
