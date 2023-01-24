package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        final int n = 3;
        for (int i = 0; i < n; i++) {
            Lottery lottery = new Lottery();
            System.out.println(lottery);
        }
    }
}

