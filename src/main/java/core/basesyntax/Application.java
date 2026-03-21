package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        String index = new Lottery().getRandomBall();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            index = new Lottery().getRandomBall();
            result.append(index).append(" ");
        }
        System.out.println(result.toString());
    }
}
